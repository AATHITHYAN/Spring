import com.learning.model.Speaker;
import com.learning.service.SpeakerService;
import com.learning.service.SpeakerServiceImpl;

public class Application
{
    public static void main(String[] args)
    {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
