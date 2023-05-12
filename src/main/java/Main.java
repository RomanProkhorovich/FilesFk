import com.example.Store.CSVController;
import com.example.Store.Model.CSVRecord;
import com.example.Store.Repos.Repository;

public class Main {
    public static void main(String[] args) {
        CSVController controller=new CSVController(new Repository<>(CSVRecord.class));
        controller.save(new CSVRecord("",2,""));
    }
}
