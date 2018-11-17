
# Showltan

Showltan application provides movies and showtv titles for a given user


## Motivation

This application has been built to learn how start building a microservice architecture.


## Warm up

Download source code and compile module by module. 

## Start your engines


Please follow the steps in order to see application in action:
 
Do not forget to stick an eye on logs while deploying. 
 
 - Start ConfigApplication:
    - You can check application is working by clicking any link below:
        - [Movies Config - http://localhost:8888/movies/service](http://localhost:8888/movies/service) 
        - [User Config - http://localhost:8888/users/service](http://localhost:8888/users/service) 
        - [TvShow Config - http://localhost:8888/tvshows/service](http://localhost:8888/tvshows/service) 
 
 - Start DiscoveryApplication
    - Eureka server can be visited at [http://localhost:1111/](http://localhost:1111)
     
 - Start DashboardApplication
    - Hystrix dashboard can be checked at [http://localhost:8080/hystrix](http://localhost:8080/hystrix)
    
 - Start MoviesApplication
 - Start TvShowsApplication
 - Start UsersApplication
 

## Have a try
At this point you can:

 - Revisit [Eureka Discover application http://localhost:1111/](http://localhost:1111) and see the tree instances running.

 - Monitor with Hystrix Dashboard Userservice instance at [localhost:8080/hystrix/monitor?stream=http://localhost:3003/actuator/hystrix.stream](localhost:8080/hystrix/monitor?stream=http://localhost:3003/actuator/hystrix.stream). 
 Note that Loading message will remain until you start using UserService.

 - Make a query (or several) to [http://localhost:3003/users/manu@showltan.com](http://localhost:3003/users/manu@showltan.com) you will receive a json response.
 
 - Hystrix Dashboard will change Loading message with graphs and metrics that represent findAllMovies and findAllTvShows status & health.



### TODO

- Compile by root main module

 