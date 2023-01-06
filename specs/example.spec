Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

imdbProject
-----------
tags:imdbwEBotomastion
* Go to the site with "https://www.imdb.com/"
* Arama cubugunun sol tarafinda menu butonuna basilir
* Gelen ekranda Oscars butonuna tiklanir
* Event history basligi altinda 1929 secilir
* Honorary awards basligi altinda circus secilir director,writer,stars bilgileri kaydedilir
* Sol ustteki imdb tiklanarak anasayfaya donulur
* Arama alanina The Circus yazilir,sonuclar arasinda gelen The Circus tiklanir
* Bilgisi kaydedilen director, writer,stars ayni mi kontrol edilir