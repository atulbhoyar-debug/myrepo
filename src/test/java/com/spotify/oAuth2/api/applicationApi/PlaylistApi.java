package com.spotify.oAuth2.api.applicationApi;

import static com.spotify.oAuth2.api.Route.PLAYLISTS;
import static com.spotify.oAuth2.api.Route.USERS;
import static com.spotify.oAuth2.api.TokenManager.getToken;

import com.spotify.oAuth2.api.RestResource;
import com.spotify.oAuth2.pojo.Playlist;
import com.spotify.oAuth2.utils.ConfigLoader;

import io.qameta.allure.Step;
import io.restassured.response.Response;

public class PlaylistApi {

    @Step
    public static Response post(Playlist requestPlaylist){
        return RestResource.post(USERS + "/" + ConfigLoader.getInstance().getUser()
                + PLAYLISTS, getToken(), requestPlaylist);
    }

    public static Response post(String token, Playlist requestPlaylist){
        return RestResource.post(USERS + "/" + ConfigLoader.getInstance().getUser()
                + PLAYLISTS, token, requestPlaylist);
    }

    public static Response get(String playlistId){
        return RestResource.get(PLAYLISTS + "/" + playlistId, getToken());
    }

    public static Response update(String playlistId, Playlist requestPlaylist){
        return RestResource.update(PLAYLISTS + "/" + playlistId, getToken(), requestPlaylist);
    }
}
