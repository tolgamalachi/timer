package time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/gettime")
public class GetTime {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTime() {
        return "" + (System.currentTimeMillis());
    }

}
