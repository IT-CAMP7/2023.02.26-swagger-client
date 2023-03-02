package pl.camp.it.rest.api;

import pl.camp.it.rest.model.OrderPositionDTO;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Bookstore API
 *
 * <p>Jakies fajne api bo ksiegarni
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface RestApiOrderPositionControllerApi  {

    /**
     * getOrderPositionById
     *
     */
    @GET
    @Path("/api/v1/orderposition/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrderPositionById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderPositionDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public OrderPositionDTO getOrderPositionByIdUsingGET(@PathParam("id") Integer id);
}

