package com.udacity.gradle.builditbigger.backend;

import com.example.javalib.MyClass;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;


/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that will return a link with more jokes */
    @ApiMethod(name = "sayJokesLink")
    public MyBean sayJokesLink() {
        MyBean response = new MyBean();
        MyClass sayLink = new MyClass();
        response.setData(sayLink.getJokesLink());

        return response;
    }

}
