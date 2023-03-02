package pl.camp.it.rest.api;

import pl.camp.it.rest.model.User;
import pl.camp.it.rest.model.UserDTO;
import pl.camp.it.rest.model.UserResponseDTO;

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
public interface RestApiUserControllerApi  {

    /**
     * getUserById
     *
     */
    @GET
    @Path("/api/v1/user/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getUserById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserResponseDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public UserResponseDTO getUserByIdUsingGET(@PathParam("id") Integer id);

    /**
     * getUserByLogin
     *
     */
    @GET
    @Path("/api/v1/user")
    @Produces({ "*/*" })
    @ApiOperation(value = "getUserByLogin", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserResponseDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public UserResponseDTO getUserByLoginUsingGET(@QueryParam("login")String login);

    /**
     * saveUser
     *
     */
    @POST
    @Path("/api/v1/user")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "saveUser", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public User saveUserUsingPOST(UserDTO userDTO);

    /**
     * updateUser
     *
     */
    @PUT
    @Path("/api/v1/user/{id}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "updateUser", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public User updateUserUsingPUT(@PathParam("id") Integer id, UserDTO userDTO);
}

