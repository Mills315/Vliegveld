package VliegveldXYZ;

import VliegveldXYZ.Vliegveld;
import VliegveldXYZ.VliegveldRepository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/vliegveld")
public class VliegveldController {

    private VliegveldRepository vliegveldRepository;

    public VliegveldController(VliegveldRepository vliegveldRepository) {
        this.vliegveldRepository = vliegveldRepository;
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public Iterable<Vliegveld> getal() {
        return this.vliegveldRepository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void create(@RequestBody Vliegveld vliegveld) {
        this.vliegveldRepository.save(vliegveld);
    }

    @RequestMapping(value = "delete/{plaats}", method = RequestMethod.DELETE)
    public @ResponseBody void remove(@PathVariable @RequestBody Vliegveld plaats) {

        this.vliegveldRepository.delete(plaats);
    }

    /*
    @RequestMapping(value = "watched/{id}", method = RequestMethod.PUT)
    public void makeWatched(@PathVariable String id) {
        Vliegveld vliegveld = this.vliegveldRepository.findById(id).get();
        if (vliegveld.isWatched()) {
            vliegveld.setWatched(false);
        } else {
            vliegveld.setWatched(true);
        }
        vliegveldRepository.save(vliegveld);
    }

    @RequestMapping(value = "/set/{id}", method = RequestMethod.PUT)
    public void makeYear(@RequestBody int year, @PathVariable String id) {
        Movies movie = this.movieRepository.findById(id).get();
        movie.setYear(year);
        movieRepository.save(movie);
    }

*/
}
