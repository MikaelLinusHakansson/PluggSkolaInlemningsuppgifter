package Udemy.Sec9.Exercise46;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artistName) {
        this.name = name;
        this.artist = artistName;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String titleOfSong) {
        if (titleOfSong != null && songs.size() > 0) {
            for (Song song : songs) {
                if (titleOfSong.equals(song.getTitle())) {
                    return song;
                }
            }
        }
        return null;
    }

    public boolean addSong(String name, double duration) {
        Song tempSong = findSong(name);
        if (tempSong != null) {
            return false; // song already added
        }
        tempSong = new Song(name, duration);  /* skapar ett nytt objekt av tempSong som
                                                 innehåller name och duration från addSong();*/
        songs.add(tempSong);  // lägger till tempSong i listan songs
        return true;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> thePlayListOfSongs) {
        if ((trackNumber <= 0) || trackNumber > songs.size()) {
            return false;
        }
        Song songToAdd = songs.get(trackNumber - 1);
        String nameOfSong = songToAdd.getTitle();
        ListIterator<Song> songListIterator = thePlayListOfSongs.listIterator();
        while (songListIterator.hasNext()) {
            if (songListIterator.next().getTitle().compareToIgnoreCase(nameOfSong) == 0) {
                return false;  // song already exists
            }

        }
        thePlayListOfSongs.add(songToAdd);
        return true;
    }


    public boolean addToPlayList(String titleOfSong, LinkedList<Song> thePlayList) {
        Song songToAdd = findSong(titleOfSong);
        if(songToAdd == null) {
            return false;
        }
        ListIterator<Song> songToCheck = thePlayList.listIterator();
        while(songToCheck.hasNext()) {
            if(songToCheck.next().getTitle().compareToIgnoreCase(songToAdd.getTitle()) == 0) {
                return false;  // song already in playlist
            }
        }

        songs.add(songToAdd);
        return true;
    }
}
