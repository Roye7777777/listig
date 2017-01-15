package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Answer;
import io.swagger.model.ExerciseDiary;
import io.swagger.model.FoodDiary;
import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-14T23:35:25.359Z")
public abstract class UsersApiService {
    public abstract Response usersGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdDelete(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdExerciseDiariesGet(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdExerciseDiariesWeekPut(String id,String week,ExerciseDiary exerciseDiaryView,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdExerciseDiaryWeekGet(String id,String week,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdFoodDiariesGet(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdFoodDiariesWeekPut(String id,String week,FoodDiary foodDiaryView,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdFoodDiaryWeekGet(String id,String week,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdGet(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdPut(String id,User userView,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdRolesPut(String id,User userView,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdScoreWeekGet(String id,String week,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdScoreWeekPut(String id,String week,Answer answerDiaryView,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersIdScoresGet(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersPost(User userView,SecurityContext securityContext) throws NotFoundException;
    public abstract Response usersPut(User userView,SecurityContext securityContext) throws NotFoundException;
}
