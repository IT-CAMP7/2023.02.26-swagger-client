package pl.camp.it.rest.api;

import pl.camp.it.rest.model.Book;
import pl.camp.it.rest.model.BooksList;

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
public interface RestApiBookControllerApi  {

    /**
     * getBookById
     *
     */
    @GET
    @Path("/api/v1/book/{bookId}")
    @Produces({ "*/*" })
    @ApiOperation(value = "getBookById", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public Book getBookByIdUsingGET(@PathParam("bookId") Integer bookId);

    /**
     * Get Books
     *
     * Return all books or books matching to pattern
     *
     */
    @GET
    @Path("/api/v1/book")
    @Produces({ "*/*" })
    @ApiOperation(value = "Get Books", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = BooksList.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public BooksList getBooksUsingGET(@QueryParam("pattern")String pattern);

    /**
     * saveBook
     *
     */
    @POST
    @Path("/api/v1/book")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "saveBook", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public Book saveBookUsingPOST(Book book);

    /**
     * updateBook
     *
     */
    @PUT
    @Path("/api/v1/book/{bookId}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "updateBook", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Book.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    public Book updateBookUsingPUT(Book book, @PathParam("bookId") Integer bookId);
}

