package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UsersApiService;
import io.swagger.api.factories.UsersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Answer;
import io.swagger.model.ExerciseDiary;
import io.swagger.model.FoodDiary;
import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/Users")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the Users API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-14T23:35:25.359Z")
public class UsersApi  {
   private final UsersApiService delegate = UsersApiServiceFactory.getUsersApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Users", notes = "Get a list of all users", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "returns all users.", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unhandled error", response = User.class) })
    public Response usersGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersGet(securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete user by id", notes = "Delete user by given id", response = void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User deleted", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = void.class) })
    public Response usersIdDelete(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdDelete(id,securityContext);
    }
    @GET
    @Path("/{id}/exercise_diaries")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Excercise diaries by id", notes = "Return exercise diary by user whose id is the given value", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Diaries found", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = User.class) })
    public Response usersIdExerciseDiariesGet(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdExerciseDiariesGet(id,securityContext);
    }
    @PUT
    @Path("/{id}/exercise_diaries/{week}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit exercise diary by id and week", notes = "Edit exercise diary by user for a week", response = void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Diary edited", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = void.class) })
    public Response usersIdExerciseDiariesWeekPut(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@ApiParam(value = "number of week",required=true) @PathParam("week") String week
,@ApiParam(value = "The JSON you want to post" ,required=true) ExerciseDiary exerciseDiaryView
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdExerciseDiariesWeekPut(id,week,exerciseDiaryView,securityContext);
    }
    @GET
    @Path("/{id}/exercise_diary/{week}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Exercise diary by id and week", notes = "Exercise diary by user for a week", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Diary found", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = User.class) })
    public Response usersIdExerciseDiaryWeekGet(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@ApiParam(value = "number of week",required=true) @PathParam("week") String week
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdExerciseDiaryWeekGet(id,week,securityContext);
    }
    @GET
    @Path("/{id}/food_diaries")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Food diaries by id", notes = "Return food diary by user whose id is the given value", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Diaries found", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = User.class) })
    public Response usersIdFoodDiariesGet(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdFoodDiariesGet(id,securityContext);
    }
    @PUT
    @Path("/{id}/food_diaries/{week}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit food diary by id and week", notes = "Edit food diary by user for a week", response = void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Diary edited", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = void.class) })
    public Response usersIdFoodDiariesWeekPut(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@ApiParam(value = "number of week",required=true) @PathParam("week") String week
,@ApiParam(value = "The JSON you want to post" ,required=true) FoodDiary foodDiaryView
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdFoodDiariesWeekPut(id,week,foodDiaryView,securityContext);
    }
    @GET
    @Path("/{id}/food_diary/{week}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Food diary by id and week", notes = "Food diary by user for a week", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Diary found", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = User.class) })
    public Response usersIdFoodDiaryWeekGet(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@ApiParam(value = "number of week",required=true) @PathParam("week") String week
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdFoodDiaryWeekGet(id,week,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "User by id", notes = "Return user by given id", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User found", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = User.class) })
    public Response usersIdGet(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdGet(id,securityContext);
    }
    @PUT
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit user by id", notes = "Edit user by given id", response = void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User edited", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = void.class) })
    public Response usersIdPut(@ApiParam(value = "user id ",required=true) @PathParam("id") String id
,@ApiParam(value = "The JSON you want to post" ,required=true) User userView
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdPut(id,userView,securityContext);
    }
    @PUT
    @Path("/{id}/roles")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit roles for user", notes = "Edit roles for user by id", response = void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "user edited", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = void.class) })
    public Response usersIdRolesPut(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@ApiParam(value = "The JSON you want to post" ,required=true) User userView
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdRolesPut(id,userView,securityContext);
    }
    @GET
    @Path("/{id}/score/{week}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Score by id and week", notes = "Score by user for a week", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Score found", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = User.class) })
    public Response usersIdScoreWeekGet(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@ApiParam(value = "number of week",required=true) @PathParam("week") String week
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdScoreWeekGet(id,week,securityContext);
    }
    @PUT
    @Path("/{id}/score/{week}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit (add) score by id and week", notes = "Edit (add) score by user for a week", response = void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Score edited/added", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = void.class) })
    public Response usersIdScoreWeekPut(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@ApiParam(value = "number of week",required=true) @PathParam("week") String week
,@ApiParam(value = "The JSON you want to post" ,required=true) Answer answerDiaryView
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdScoreWeekPut(id,week,answerDiaryView,securityContext);
    }
    @GET
    @Path("/{id}/scores")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Scores by id", notes = "Return scores by user whose id is the given value", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Scores found", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = User.class) })
    public Response usersIdScoresGet(@ApiParam(value = "user id",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersIdScoresGet(id,securityContext);
    }
    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create user", notes = "Create a new user", response = void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unhandled error", response = void.class) })
    public Response usersPost(@ApiParam(value = "The JSON you want to post" ,required=true) User userView
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersPost(userView,securityContext);
    }
    @PUT
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit all users", notes = "Edit all users with given view", response = void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid input", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unhandled error", response = void.class) })
    public Response usersPut(@ApiParam(value = "The JSON you want to post" ,required=true) User userView
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usersPut(userView,securityContext);
    }
}
