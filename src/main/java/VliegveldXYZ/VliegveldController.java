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











}
