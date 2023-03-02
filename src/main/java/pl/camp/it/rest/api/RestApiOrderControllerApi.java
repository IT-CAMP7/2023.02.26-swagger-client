package pl.camp.it.rest.api;

import pl.camp.it.rest.model.Order;
import pl.camp.it.rest.model.OrderDTO;
import pl.camp.it.rest.model.OrdersDTO;
import pl.camp.it.rest.model.SaveOrderRequest;

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
public interface RestApiOrderControllerApi  {

    /**
     * getOrderById
     *
     */
    @GET
    @Path("/api/v1/order/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrderById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public OrderDTO getOrderByIdUsingGET(@PathParam("id") Integer id);

    /**
     * getOrdersByUserId
     *
     */
    @GET
    @Path("/api/v1/order")
    @Produces({ "*/*" })
    @ApiOperation(value = "getOrdersByUserId", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrdersDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public OrdersDTO getOrdersByUserIdUsingGET(@QueryParam("userId")Integer userId);

    /**
     * saveOrder
     *
     */
    @POST
    @Path("/api/v1/order")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "saveOrder", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Order.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public Order saveOrderUsingPOST(SaveOrderRequest orderRequest);
}

