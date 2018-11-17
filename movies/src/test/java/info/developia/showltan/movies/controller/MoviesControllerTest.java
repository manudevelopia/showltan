package info.developia.showltan.movies.controller;

import info.developia.showltan.movies.IntegrationBaseTest;
import org.junit.Before;
import org.junit.Test;


public class MoviesControllerTest extends IntegrationBaseTest {

    @Before
    public void setUp() {
    }

    @Test
    public void testGetAll() throws Exception {
        applicationUrl().
                when().get("/movies/all").then()
                .statusCode(200);
    }

}
