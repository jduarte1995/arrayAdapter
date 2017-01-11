package com.example.jess.listview;

/**
 * Created by Jesús on 21/12/2016.
 */

public class titular
    {
        private String titulo;
        private String subtitulo;
        private String foto;

        public titular(String tit, String sub, String foto){
            titulo = tit;
            subtitulo = sub;
            this.foto = foto;
        }

        public String getTitulo(){
            return titulo;
        }

        public String getFoto(){
            return foto;
        }

        public String getSubtitulo(){
            return subtitulo;
        }

}
