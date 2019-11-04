package hbm.cpapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Db  extends SQLiteOpenHelper{
    public Db(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuarios(codigo integer primary key,usuario text,contrasena text,nombre text, fnacimiento text,correo text,celular text)");

        db.execSQL("insert into usuarios values(01,'manuelc','12345678','Manuel Coca','14/06/1995','cordinacionacademicacpa@gmail.com','3022490302')");
        db.execSQL("insert into usuarios values(02,'admin','1','admin','26/06/1994','habered058@hotmail.com','3102387521')");
        db.execSQL("insert into usuarios values(03,'edinsoncas','1','Claudia Helena Lugo Contreras','10/10/1997','claudita74_@hotmail.com','3222056943')");
        db.execSQL("insert into usuarios values(04,'leonardo788','1031164788','Cristian Leonardo Martínez Molano','03/02/1996','clmm_296@hotmail.com','3197693557')");
        db.execSQL("insert into usuarios values(05,'carlos050','19451050','Carlos Humberto Moreno Torres','23/09/1961','falta@gmail.com','3123869980')");
        db.execSQL("insert into usuarios values(06,'daniel387','1022394387','Daniel Felipe Pineda Pinzón','01/07/1994','levitaciononirica@gmail.com','3193256026')");
        db.execSQL("insert into usuarios values(07,'carolina203','1013656203','Ingrid Carolina Rodríguez Antolinez','29/01/1995','carolmlaf95@gmail.com','3195800220')");
        db.execSQL("insert into usuarios values(08,'sandra487','1022970487','Sandra Milena Lancheros Criollo','04/08/1991','Sandra.m.lancheros@gmail.com','3124641603')");
        db.execSQL("insert into usuarios values(09,'alejandra232','1016062232','María Alejandra Venegas Solórzano','28/12/1993','mary.21aleja.vs@gmail.com','3224214641')");
        db.execSQL("insert into usuarios values(10,'jhonny350','1192765350','Jonathan Steven Bernate Real','26/03/2001','jbernate3@gmail.com','3106739716')");
        db.execSQL("insert into usuarios values(11,'duvan445','1000713445','Duvan Francisco Martínez Barrera','06/10/2000','dufran2000@gmail.com','3124505540')");
        db.execSQL("insert into usuarios values(12,'veronica623','52897623','Verónica Viviana Sandoval Salamanca','6/08/1981','veronicasomosseis@gmail.com','3202784309')");

        db.execSQL("create table personas(documento text primary key,tipodoc text,nombre text,apellido text,fnacimiento text,direccion text,correo text,telefono text, celular text,genero text,rh text,eps text,enfermedad text,tipo text)");

        db.execSQL("insert into personas values('1021316292','Registro Civil','Alyson Valeria','Abella Sandoval','2011-11-18','Cra 10 # 103 a -27 sur','veronicasomosseis@gmail.com','Ninguno','3202784309','F','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1028680593','Tarjeta de identidad','Angela Valentina','Camacho Real','2007-07-20','Trv 16 # 44-21 sur','Ninguno','5172630','3116391092','F','A+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1031159532','Cédula de Ciudadanía','Angie Lizeth','Alvarado','1995-06-14','Cra 19 B Bis # 60 - 29 sur','lizeealvarado14@gmail.com','7619295','3022490302','F','O+','Salud Total','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1033722078','Tarjeta de identidad','Brayan Alexander','Torres Gacha','2008-05-06','Cra 5 bis #111b-88 sur','alisongacha@gmail.com','7643329','3057638542','M','O+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1021314257','Tarjeta de identidad','Brayan Mateo','Abella Sandoval','2007-10-14','Cra 10 #103a-27 sur','veronicasomosseis@gmail.com','Ninguno','3202784309','M','B+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('19451050','Cédula de Ciudadanía','Carlos Humberto','Moreno Torres','1961-09-23','Calle 6d #5-50','carloshumberto.moreno@gmail.com','1234567','3123869980','M','O+','Nueva Eps','Ninguna','Director')");
        db.execSQL("insert into personas values('1023025105','Cédula de Ciudadanía','Claudia Helena','Lugo Contreras','1997-10-10','Calle 93 Sur #1-06','claudita74_@hotmail.com','7645270','3222056943','F','A+','Capital Salud','Ninguna','Comunidad')");
        db.execSQL("insert into personas values('1022947069','Tarjeta de identidad','Cristian Esteban','Diaz López','2006-11-29','Cra 1 a # 100c-26 sur','cristiandiaz777@gmail.com','Ninguno','3137729755','M','O+','Capital Salud','Miopía','Estudiante')");
        db.execSQL("insert into personas values('1031164788','Cédula de Ciudadanía','Cristian Leonardo','Martínez Molano','1996-02-03','Cra 19B Bis #61A 49 Sur','clmm_296@hotmail.com','7645270','3197693557','M','A+','Sanitas','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1026280458','Tarjeta de identidad','Daniel Abzadquiel','Martinez Rodriguez','2010-07-03','Lote 6 los pinos- Vereda Cerro Redondo ','mujerescampesinasyrurales@gmail.com','Ninguno','3003908296','M','O+','Famisanar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1146127772','Tarjeta de identidad','Danna Valetina','Tole Cubillos','2011-09-06','Cra 14 bis # 136 a-60 sur','Leidyjcp@gmail.com','2362565','3197968495','F','O+','Famisanar','Dermatitis','Estudiante')");
        db.execSQL("insert into personas values('1117518863','Tarjeta de identidad','Deisy Yulieth','Cortez','2009-06-22','La Requilina','Ninguno','Ninguno','3106194887','F','O+','Asmet Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022991709','Registro Civil','Deivi Yulian','Gutierrez Gacha','2011-12-03','Cra 5 bis #111b-88 sur','alisongacha@gmail.com','7643329','3057638542','M','A+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1027529496','Tarjeta de identidad','Diego Andrés','Rodriguez García','2005-03-14','Cll 109 # 13-18','Ninguno','2000619','3115554288','M','A+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140918226','Tarjeta de identidad','Dilan Mateo ','Avila Mora ','2008-04-10','cll116 sur #8a-16','mateo8908@hotmail.com','4966424','3003583952','M','O+','Nueva Eps','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1000713445','Tarjeta de identidad','Duvan Francisco','Martínez Barrera','2000-10-06','Cll 33a #23a 36 sur','dufran2000@gmail.com','Ninguno','3124505540','M','O+','Compensar','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1021312913','Tarjeta de identidad','Edna Lizeth','Abella Sandoval','2005-03-15','Cra 10 #103a-27 sur','veronicasomosseis@gmail.com','Ninguno','3202784309','F','B+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140915119','Tarjeta de identidad','Eduart Alexis',' Espejo Benavides','2006-07-27','Cl 104A sur # 12-18','EDUART2BENAVIDES@GMAIL.COM','Ninguno','3125023151','M','O+','Capital Salud','Oído','Estudiante')");
        db.execSQL("insert into personas values('1023368421','Tarjeta de identidad','Elkin Camilo','Arias Ortiz','2005-05-05','Cra 14 K 138 C SUR 39 TO4 APT 801','neftaly_6581@hotmail.com','3016782','3118639268','M','O+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022937831','Tarjeta de identidad','Erick Santiago','Tererros Agudelo','2005-10-12','Calle 116 A Sur #8 A 32','ericksantiagoterreros@olayista.com','Ninguno','3227510167','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1089089198','Tarjeta de identidad','Esteban','Alvarez Parra','2005-12-07','Cra 14 #108 11 sur','angeles2113@hotmail.com','3915485','3209221027','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1031154182','Cédula de Ciudadanía','Harry','Bernate Real','1994-06-26','Diagonal 61b sur #18q 46','harryreal058@gmail.com','2859935','3182519523','M','O+','Capital Salud','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1013656203','Cédula de Ciudadanía','Ingrid Carolina','Rodríguez Antolinez','1995-01-29','Cll41sur#3c-75este int2 apa 502','carolmlaf95@gmail.com','Ninguno','3195800220','F','A+','Medimas','Metronidazol','Psicóloga')");
        db.execSQL("insert into personas values('1033740078','Tarjeta de identidad','Jarol Dayan','Torres Gacha','2009-11-17','Cra 5 bis #111b 88 sur','alisongacha@gmail.com','7643329','3057638542','M','O+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022929904','Tarjeta de identidad','Javier Antonio ','Bustos Lancheros','2004-12-15','cll113 sur #44-2 este','nataliacortes85423@gmail.com','7730843','3134799474','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022940270','Tarjeta de identidad','Jeferson Estiben','Mendez Cortés','2006-01-22','Cll 115 b sur # 9 57','Ninguno','4623743','3133987103','M','O+','Coomeva','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1026287826','Registro Civil','Jeliel Rafael Nahuel','Martínez Rodríguez','2012-03-29','Lote 6- Vereda Cerro Redondo Corinto','mujerescampesinasyrurales@gmail.com','Ninguno','3003908296','M','O+','Famisanar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1014481187','Tarjeta de identidad','Jesus David ','Nomelín','2006-10-26','cll 116 a sur # 1 c 46','Ninguno','Ninguno','3138589326','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1029284400','Registro Civil','Jhoan Esteban','Puertas Giraldo','2010-04-01','0','Ninguno','Ninguno','0','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1192765350','Tarjeta de identidad','Jonathan Steven','Bernate Real','2001-03-26','Diagonal 61b sur #18q 46','jbernate3@gmail.com','2859935','3106739716','M','O+','Capital Salud','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1021673816','Tarjeta de identidad','Juan Camilo','Rodríguez Galvis','2007-03-10','Calle 104 Sur #14-80','estellagalvis@hotmail.com','7609443','3133222501','M','O+','Compensar','Asma','Estudiante')");
        db.execSQL("insert into personas values('1140921815','Tarjeta de identidad','Juan Camilo ','Patiño de Dios','2010-02-05','Cra 7 NO 99 sur-40','Ninguno','Ninguno','3228378904','M','A+','Salud Total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022942138','Tarjeta de identidad','Juan Luis ','Bayona Gonzáles','2006-03-16','Calle 95 B Sur # 14 C 05','Ninguno','Ninguno','3216743264','M','A+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1014739098','Tarjeta de identidad','Juan Sebastián','Cifuentes Solano','2005-12-23','Cra 1 f # 92b19 sur','plucas.pato@hotmail.com','7615182','3203824566','M','B+','Famisanar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140914866','Tarjeta de identidad','Juan Sebastián ','Vargas Robelto','2006-04-14','Cll 95 b sur n 2-64','alejandrosapatero1974@hotmail.com','Ninguno','3115757005','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1021315795','Tarjeta de identidad','Karol Dayany','Abella Sandoval','2010-04-19','Cra 10 #103 a 27 sur','veronicasomosseis@gmail.com','Ninguno','3202784309','F','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1110173535','Tarjeta de identidad','Kevin Ronaldo ','Silva Tapia','2005-06-08','Tv 1b 114 sur 20 2 2','Ninguno','Ninguno','3138258626','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022926345','Tarjeta de identidad','Kevin Santiago','Gutierrez Poveda','2004-07-12','Calle 114 Sur #7-42 ','mafi-10@hotmail.com','7671417','3186520989','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140917500','Tarjeta de identidad','Kevin Santiago ','Sora Beltrán','2007-10-10','Calle 93 # 7 A 37','Ninguno','Ninguno','3133856500','M','O+','Sanitas','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1023379805','Tarjeta de identidad','Laura Sofia','Arias Ortíz','2008-05-13','Cra 14 K 138 C SUR 39','neftaly_6581@hotmail.com','3016782','3118639268','F','O+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1001169102','Tarjeta de identidad','Laura Valentina','Alvarez Parra','2003-07-12','Cra 14 #108 11 sur','angeles2113@hotmail.com','3915485','3209221027','F','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1029280830','Tarjeta de identidad','Maicol Duvan ','Zapata Cristancho','2007-06-28','Cll 94 14 j 05 sur','Ninguno','Ninguno','3134472359','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1087126839','Tarjeta de identidad','Maikel Francisco','Salazar Ordóñez','2007-04-13','Calle 104 Sur # 14-80','mikesala2007@outlook.es','Ninguno','3214895220','M','A+','Sanitas','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('51647309','Cédula de Ciudadanía','Margarita','Rodríguez Molina','1953-11-03','Cll 94# 14 -46 sur','Ninguno','Ninguno','3118466535','F','O+','Nueva Eps','Artritis','Comunidad')");
        db.execSQL("insert into personas values('1016062232','Cédula de Ciudadanía','María Alejandra','Venegas Solórzano','1993-12-28','Diagonal 16 b bis # 98-50','mary.21aleja.vs@gmail.com','7620122','3224214641','F','O+','Compensar','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1016729238','Registro Civil','Maria Paula','Avila Mora ','2012-10-10','cll 116 sur # 8 a 16','mateo8908@hotmail.com','4966424','3003583952','F','O+','Nueva Eps','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140917506','Tarjeta de identidad','Mateo ','Gutierrez Medina','2007-10-25','Calle 114 Sur # 7-42','mafi-10@hotmail.com','7671417','3133167258','M','O+','Famisanar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1089607506','Tarjeta de identidad','Natalia','Alvarez Parra','2009-12-12','Cra 14 # 108 11 sur','angeles2113@hotmail.com','3915485','3209221027','F','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1029283239','Tarjeta de identidad','Oscar Esteban','Gutierrez Poveda','2008-12-23','Calle 114 Sur # 7-42 ','mafi-10@hotmail.com','7671417','3186520989','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140920328','Tarjeta de identidad','Oscar Santiago','Villamil Mora','2009-06-29','cll 116 a sur # 8- 70','luisacast32@hotmail.com','4966424','3144871448','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022926937','Tarjeta de identidad','Ramiro Ferney','Agudelo León','2004-07-29','Cra 5 108B sur 08','Ninguno','Ninguno','3102831096','M','O+','Sura','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022955818','Tarjeta de identidad','Richard Andres',' Useche López','2007-11-25','Cra 5 NO 96 A sur-52','Ninguno','Ninguno','3014123272','M','O+','Sanitas','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('52749244','Cédula de Ciudadanía','Sandra Milena','González','1984-06-02','Calle 95 B Sur # 14 C 05','Ninguno','Ninguno','3216743264','F','A+','Capital Salud','Ninguna','Comunidad')");
        db.execSQL("insert into personas values('1022970487','Cédula de Ciudadanía','Sandra Milena','Lancheros Criollo','1991-08-04','Cll 72 a sur # 13-22','Sandra.m.lancheros@gmail.com','Ninguno','3124641603','F','O+','Cruz Blanca ','Rinitis','Tallerista')");
        db.execSQL("insert into personas values('1032677878','Tarjeta de identidad','Santiago','Peña Serrano','2005-04-27','Cra 1 d 99-06 sur','emiropeamarin@yahoo.com','2565285','3142924448','M','O+','Nueva Eps','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1016730714','Tarjeta de identidad','Sara Nicole','Tole Cubillos','2013-05-30','Cra 14bi # 136 a 60 sur','Leidyjcp@gmail.com','2362565','3197968495','F','O+','Famisanar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1012414518','Registro Civil','Sebastian','Maldonado Suarez','2012-09-15','Cra 101a sur # 14-5','cordinacionacademicacpa@gmail.com','Ninguno','3112066638','M','A+','Cafesalud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('51816810','Cédula de Ciudadanía','Sonia','Cortés Rico','1966-06-03','Cll 115 b sur # 9 57','Ninguno','4623743','3133987103','F','O+','Coomeva','Tiroides','Comunidad')");
        db.execSQL("insert into personas values('1034781744','Tarjeta de identidad','Verónica ','Briceño Gonzales ','2008-08-17','Cll 78 sur 7 22','march2313@hotmail.com','7260509','3223511402','F','O+','Salud Total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('52897623','Cédula de Ciudadanía','Verónica Viviana ','Sandoval Salamanca ','1981-08-06','Cra 10 #103 a 27 sur','veronicasomosseis@gmail.com','Ninguno','3202784309','F','B+','Capital Salud','Ninguna','Comunidad')");
        db.execSQL("insert into personas values('1023871390','Tarjeta de identidad','Yohan Estiven','Forero Gonzáles','2011-06-13','Calle 136 sur # 3 C 85','Ninguno','Ninguno','3053503978','M','O+','Aliansalud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022966872','Tarjeta de identidad','Andrei Nicolás','Rodríguez Benítez','2009-02-14','Calle 115 A sur# 7-23','blankithabenitez@gmail.com','2328746','3108749897','M','O+','Capital Salud','Rinitis','Estudiante')");
        db.execSQL("insert into personas values('1022998159','Tarjeta de identidad','Sarai Sofía','Terreros Barrera','2012-08-28','Calle 116 A Sur # 8 A 32','minipolli2006@hotmail.com','Ninguno','3203774021','F','O+','Cruz Blanca','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022929900','Tarjeta de identidad','Juan Daniel','Rodríguez Benítez','2004-11-22','Calle 115 A sur# 7-23','juandanielrodriguezbenitez@gmail.com','2328746','3108749897','M','A+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140916024','Tarjeta de identidad','Ángel Sebastián','Rodríguez Benítez','2006-12-02','Calle 115 A sur# 7-23','sebasgamerrodriguez@gmail.com','2328746','3108749897','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1028783254','Tarjeta de identidad','Yojan Mauricio ','Coronado Ramírez','2006-03-21','Calle 95 a # 14 j 36','Ninguno','Ninguno','3007277016','M','O+','Sura','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022990714','Tarjeta de identidad','Juan Felipe','Terreros Agudelo','2011-10-08','Calle 116 A Sur # 8 A 32','minipolli2006@hotmail.com','Ninguno','3203774021','M','O+','Capital Salud','Ninguna','Estudiante')");




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("create table usuarios(codigo integer primary key,usuario text,contrasena text,nombre text, fnacimiento text,correo text,celular text)");

        db.execSQL("insert into usuarios values(01,'manuelc','12345678','Manuel Coca','14/06/1995','cordinacionacademicacpa@gmail.com','3022490302')");
        db.execSQL("insert into usuarios values(02,'admin','1','admin','26/06/1994','habered058@hotmail.com','3102387521')");
        db.execSQL("insert into usuarios values(03,'edinsoncas','1','Claudia Helena Lugo Contreras','10/10/1997','claudita74_@hotmail.com','3222056943')");
        db.execSQL("insert into usuarios values(04,'leonardo788','1031164788','Cristian Leonardo Martínez Molano','03/02/1996','clmm_296@hotmail.com','3197693557')");
        db.execSQL("insert into usuarios values(05,'carlos050','19451050','Carlos Humberto Moreno Torres','23/09/1961','falta@gmail.com','3123869980')");
        db.execSQL("insert into usuarios values(06,'daniel387','1022394387','Daniel Felipe Pineda Pinzón','01/07/1994','levitaciononirica@gmail.com','3193256026')");
        db.execSQL("insert into usuarios values(07,'carolina203','1013656203','Ingrid Carolina Rodríguez Antolinez','29/01/1995','carolmlaf95@gmail.com','3195800220')");
        db.execSQL("insert into usuarios values(08,'sandra487','1022970487','Sandra Milena Lancheros Criollo','04/08/1991','Sandra.m.lancheros@gmail.com','3124641603')");
        db.execSQL("insert into usuarios values(09,'alejandra232','1016062232','María Alejandra Venegas Solórzano','28/12/1993','mary.21aleja.vs@gmail.com','3224214641')");
        db.execSQL("insert into usuarios values(10,'jhonny350','1192765350','Jonathan Steven Bernate Real','26/03/2001','jbernate3@gmail.com','3106739716')");
        db.execSQL("insert into usuarios values(11,'duvan445','1000713445','Duvan Francisco Martínez Barrera','06/10/2000','dufran2000@gmail.com','3124505540')");
        db.execSQL("insert into usuarios values(12,'veronica623','52897623','Verónica Viviana Sandoval Salamanca','6/08/1981','veronicasomosseis@gmail.com','3202784309')");

        db.execSQL("create table personas(documento text primary key,tipodoc text,nombre text,apellido text,fnacimiento text,direccion text,correo text,telefono text, celular text,genero text,rh text,eps text,enfermedad text,tipo text)");

        db.execSQL("insert into personas values('1021316292','Registro Civil','Alyson Valeria','Abella Sandoval','2011-11-18','Cra 10 # 103 a -27 sur','veronicasomosseis@gmail.com','Ninguno','3202784309','F','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1028680593','Tarjeta de identidad','Angela Valentina','Camacho Real','2007-07-20','Trv 16 # 44-21 sur','Ninguno','5172630','3116391092','F','A+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1031159532','Cédula de Ciudadanía','Angie Lizeth','Alvarado','1995-06-14','Cra 19 B Bis # 60 - 29 sur','lizeealvarado14@gmail.com','7619295','3022490302','F','O+','Salud Total','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1033722078','Tarjeta de identidad','Brayan Alexander','Torres Gacha','2008-05-06','Cra 5 bis #111b-88 sur','alisongacha@gmail.com','7643329','3057638542','M','O+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1021314257','Tarjeta de identidad','Brayan Mateo','Abella Sandoval','2007-10-14','Cra 10 #103a-27 sur','veronicasomosseis@gmail.com','Ninguno','3202784309','M','B+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('19451050','Cédula de Ciudadanía','Carlos Humberto','Moreno Torres','1961-09-23','Calle 6d #5-50','carloshumberto.moreno@gmail.com','1234567','3123869980','M','O+','Nueva Eps','Ninguna','Director')");
        db.execSQL("insert into personas values('1023025105','Cédula de Ciudadanía','Claudia Helena','Lugo Contreras','1997-10-10','Calle 93 Sur #1-06','claudita74_@hotmail.com','7645270','3222056943','F','A+','Capital Salud','Ninguna','Comunidad')");
        db.execSQL("insert into personas values('1022947069','Tarjeta de identidad','Cristian Esteban','Diaz López','2006-11-29','Cra 1 a # 100c-26 sur','cristiandiaz777@gmail.com','Ninguno','3137729755','M','O+','Capital Salud','Miopía','Estudiante')");
        db.execSQL("insert into personas values('1031164788','Cédula de Ciudadanía','Cristian Leonardo','Martínez Molano','1996-02-03','Cra 19B Bis #61A 49 Sur','clmm_296@hotmail.com','7645270','3197693557','M','A+','Sanitas','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1026280458','Tarjeta de identidad','Daniel Abzadquiel','Martinez Rodriguez','2010-07-03','Lote 6 los pinos- Vereda Cerro Redondo ','mujerescampesinasyrurales@gmail.com','Ninguno','3003908296','M','O+','Famisanar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1146127772','Tarjeta de identidad','Danna Valetina','Tole Cubillos','2011-09-06','Cra 14 bis # 136 a-60 sur','Leidyjcp@gmail.com','2362565','3197968495','F','O+','Famisanar','Dermatitis','Estudiante')");
        db.execSQL("insert into personas values('1117518863','Tarjeta de identidad','Deisy Yulieth','Cortez','2009-06-22','La Requilina','Ninguno','Ninguno','3106194887','F','O+','Asmet Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022991709','Registro Civil','Deivi Yulian','Gutierrez Gacha','2011-12-03','Cra 5 bis #111b-88 sur','alisongacha@gmail.com','7643329','3057638542','M','A+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1027529496','Tarjeta de identidad','Diego Andrés','Rodriguez García','2005-03-14','Cll 109 # 13-18','Ninguno','2000619','3115554288','M','A+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140918226','Tarjeta de identidad','Dilan Mateo','Avila Mora','2008-04-10','cll116 sur #8a-16','mateo8908@hotmail.com','4966424','3003583952','M','O+','Nueva Eps','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1000713445','Tarjeta de identidad','Duvan Francisco','Martínez Barrera','2000-10-06','Cll 33a #23a 36 sur','dufran2000@gmail.com','Ninguno','3124505540','M','O+','Compensar','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1021312913','Tarjeta de identidad','Edna Lizeth','Abella Sandoval','2005-03-15','Cra 10 #103a-27 sur','veronicasomosseis@gmail.com','Ninguno','3202784309','F','B+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140915119','Tarjeta de identidad','Eduart Alexis',' Espejo Benavides','2006-07-27','Cl 104A sur # 12-18','EDUART2BENAVIDES@GMAIL.COM','Ninguno','3125023151','M','O+','Capital Salud','Oído','Estudiante')");
        db.execSQL("insert into personas values('1023368421','Tarjeta de identidad','Elkin Camilo','Arias Ortiz','2005-05-05','Cra 14 K 138 C SUR 39 TO4 APT 801','neftaly_6581@hotmail.com','3016782','3118639268','M','O+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022937831','Tarjeta de identidad','Erick Santiago','Tererros Agudelo','2005-10-12','Calle 116 A Sur #8 A 32','ericksantiagoterreros@olayista.com','Ninguno','3227510167','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1089089198','Tarjeta de identidad','Esteban','Alvarez Parra','2005-12-07','Cra 14 #108 11 sur','angeles2113@hotmail.com','3915485','3209221027','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1031154182','Cédula de Ciudadanía','Harry','Bernate Real','1994-06-26','Diagonal 61b sur #18q 46','harryreal058@gmail.com','2859935','3182519523','M','O+','Capital Salud','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1013656203','Cédula de Ciudadanía','Ingrid Carolina','Rodríguez Antolinez','1995-01-29','Cll41sur#3c-75este int2 apa 502','carolmlaf95@gmail.com','Ninguno','3195800220','F','A+','Medimas','Metronidazol','Psicóloga')");
        db.execSQL("insert into personas values('1033740078','Tarjeta de identidad','Jarol Dayan','Torres Gacha','2009-11-17','Cra 5 bis #111b 88 sur','alisongacha@gmail.com','7643329','3057638542','M','O+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022929904','Tarjeta de identidad','Javier Antonio ','Bustos Lancheros','2004-12-15','cll113 sur #44-2 este','nataliacortes85423@gmail.com','7730843','3134799474','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022940270','Tarjeta de identidad','Jeferson Estiben','Mendez Cortés','2006-01-22','Cll 115 b sur # 9 57','Ninguno','4623743','3133987103','M','O+','Coomeva','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1026287826','Registro Civil','Jeliel Rafael Nahuel','Martínez Rodríguez','2012-03-29','Lote 6- Vereda Cerro Redondo Corinto','mujerescampesinasyrurales@gmail.com','Ninguno','3003908296','M','O+','Famisanar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1014481187','Tarjeta de identidad','Jesus David ','Nomelín','2006-10-26','cll 116 a sur # 1 c 46','Ninguno','Ninguno','3138589326','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1029284400','Registro Civil','Jhoan Esteban','Puertas Giraldo','2010-04-01','0','Ninguno','Ninguno','0','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1192765350','Tarjeta de identidad','Jonathan Steven','Bernate Real','2001-03-26','Diagonal 61b sur #18q 46','jbernate3@gmail.com','2859935','3106739716','M','O+','Capital Salud','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1021673816','Tarjeta de identidad','Juan Camilo','Rodríguez Galvis','2007-03-10','Calle 104 Sur #14-80','estellagalvis@hotmail.com','7609443','3133222501','M','O+','Compensar','Asma','Estudiante')");
        db.execSQL("insert into personas values('1140921815','Tarjeta de identidad','Juan Camilo ','Patiño de Dios','2010-02-05','Cra 7 NO 99 sur-40','Ninguno','Ninguno','3228378904','M','A+','Salud Total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022942138','Tarjeta de identidad','Juan Luis ','Bayona Gonzáles','2006-03-16','Calle 95 B Sur # 14 C 05','Ninguno','Ninguno','3216743264','M','A+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1014739098','Tarjeta de identidad','Juan Sebastián','Cifuentes Solano','2005-12-23','Cra 1 f # 92b19 sur','plucas.pato@hotmail.com','7615182','3203824566','M','B+','Famisanar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140914866','Tarjeta de identidad','Juan Sebastián ','Vargas Robelto','2006-04-14','Cll 95 b sur n 2-64','alejandrosapatero1974@hotmail.com','Ninguno','3115757005','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1021315795','Tarjeta de identidad','Karol Dayany','Abella Sandoval','2010-04-19','Cra 10 #103 a 27 sur','veronicasomosseis@gmail.com','Ninguno','3202784309','F','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1110173535','Tarjeta de identidad','Kevin Ronaldo ','Silva Tapia','2005-06-08','Tv 1b 114 sur 20 2 2','Ninguno','Ninguno','3138258626','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022926345','Tarjeta de identidad','Kevin Santiago','Gutierrez Poveda','2004-07-12','Calle 114 Sur #7-42 ','mafi-10@hotmail.com','7671417','3186520989','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140917500','Tarjeta de identidad','Kevin Santiago ','Sora Beltrán','2007-10-10','Calle 93 # 7 A 37','Ninguno','Ninguno','3133856500','M','O+','Sanitas','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1023379805','Tarjeta de identidad','Laura Sofia','Arias Ortíz','2008-05-13','Cra 14 K 138 C SUR 39','neftaly_6581@hotmail.com','3016782','3118639268','F','O+','Compensar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1001169102','Tarjeta de identidad','Laura Valentina','Alvarez Parra','2003-07-12','Cra 14 #108 11 sur','angeles2113@hotmail.com','3915485','3209221027','F','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1029280830','Tarjeta de identidad','Maicol Duvan ','Zapata Cristancho','2007-06-28','Cll 94 14 j 05 sur','Ninguno','Ninguno','3134472359','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1087126839','Tarjeta de identidad','Maikel Francisco','Salazar Ordóñez','2007-04-13','Calle 104 Sur # 14-80','mikesala2007@outlook.es','Ninguno','3214895220','M','A+','Sanitas','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('51647309','Cédula de Ciudadanía','Margarita','Rodríguez Molina','1953-11-03','Cll 94# 14 -46 sur','Ninguno','Ninguno','3118466535','F','O+','Nueva Eps','Artritis','Comunidad')");
        db.execSQL("insert into personas values('1016062232','Cédula de Ciudadanía','María Alejandra','Venegas Solórzano','1993-12-28','Diagonal 16 b bis # 98-50','mary.21aleja.vs@gmail.com','7620122','3224214641','F','O+','Compensar','Ninguna','Tallerista')");
        db.execSQL("insert into personas values('1016729238','Registro Civil','Maria Paula','Avila Mora ','2012-10-10','cll 116 sur # 8 a 16','mateo8908@hotmail.com','4966424','3003583952','F','O+','Nueva Eps','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140917506','Tarjeta de identidad','Mateo ','Gutierrez Medina','2007-10-25','Calle 114 Sur # 7-42','mafi-10@hotmail.com','7671417','3133167258','M','O+','Famisanar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1089607506','Tarjeta de identidad','Natalia','Alvarez Parra','2009-12-12','Cra 14 # 108 11 sur','angeles2113@hotmail.com','3915485','3209221027','F','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1029283239','Tarjeta de identidad','Oscar Esteban','Gutierrez Poveda','2008-12-23','Calle 114 Sur # 7-42 ','mafi-10@hotmail.com','7671417','3186520989','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140920328','Tarjeta de identidad','Oscar Santiago','Villamil Mora','2009-06-29','cll 116 a sur # 8- 70','luisacast32@hotmail.com','4966424','3144871448','M','O+','Salud total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022926937','Tarjeta de identidad','Ramiro Ferney','Agudelo León','2004-07-29','Cra 5 108B sur 08','Ninguno','Ninguno','3102831096','M','O+','Sura','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022955818','Tarjeta de identidad','Richard Andres',' Useche López','2007-11-25','Cra 5 NO 96 A sur-52','Ninguno','Ninguno','3014123272','M','O+','Sanitas','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('52749244','Cédula de Ciudadanía','Sandra Milena','González','1984-06-02','Calle 95 B Sur # 14 C 05','Ninguno','Ninguno','3216743264','F','A+','Capital Salud','Ninguna','Comunidad')");
        db.execSQL("insert into personas values('1022970487','Cédula de Ciudadanía','Sandra Milena','Lancheros Criollo','1991-08-04','Cll 72 a sur # 13-22','Sandra.m.lancheros@gmail.com','Ninguno','3124641603','F','O+','Cruz Blanca ','Rinitis','Tallerista')");
        db.execSQL("insert into personas values('1032677878','Tarjeta de identidad','Santiago','Peña Serrano','2005-04-27','Cra 1 d 99-06 sur','emiropeamarin@yahoo.com','2565285','3142924448','M','O+','Nueva Eps','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1016730714','Tarjeta de identidad','Sara Nicole','Tole Cubillos','2013-05-30','Cra 14bi # 136 a 60 sur','Leidyjcp@gmail.com','2362565','3197968495','F','O+','Famisanar','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1012414518','Registro Civil','Sebastian','Maldonado Suarez','2012-09-15','Cra 101a sur # 14-5','cordinacionacademicacpa@gmail.com','Ninguno','3112066638','M','A+','Cafesalud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('51816810','Cédula de Ciudadanía','Sonia','Cortés Rico','1966-06-03','Cll 115 b sur # 9 57','Ninguno','4623743','3133987103','F','O+','Coomeva','Tiroides','Comunidad')");
        db.execSQL("insert into personas values('1034781744','Tarjeta de identidad','Verónica ','Briceño Gonzales ','2008-08-17','Cll 78 sur 7 22','march2313@hotmail.com','7260509','3223511402','F','O+','Salud Total','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('52897623','Cédula de Ciudadanía','Verónica Viviana ','Sandoval Salamanca ','1981-08-06','Cra 10 #103 a 27 sur','veronicasomosseis@gmail.com','Ninguno','3202784309','F','B+','Capital Salud','Ninguna','Comunidad')");
        db.execSQL("insert into personas values('1023871390','Tarjeta de identidad','Yohan Estiven','Forero Gonzáles','2011-06-13','Calle 136 sur # 3 C 85','Ninguno','Ninguno','3053503978','M','O+','Aliansalud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022966872','Tarjeta de identidad','Andrei Nicolás','Rodríguez Benítez','2009-02-14','Calle 115 A sur# 7-23','blankithabenitez@gmail.com','2328746','3108749897','M','O+','Capital Salud','Rinitis','Estudiante')");
        db.execSQL("insert into personas values('1022998159','Tarjeta de identidad','Sarai Sofía','Terreros Barrera','2012-08-28','Calle 116 A Sur # 8 A 32','minipolli2006@hotmail.com','Ninguno','3203774021','F','O+','Cruz Blanca','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022929900','Tarjeta de identidad','Juan Daniel','Rodríguez Benítez','2004-11-22','Calle 115 A sur# 7-23','juandanielrodriguezbenitez@gmail.com','2328746','3108749897','M','A+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1140916024','Tarjeta de identidad','Ángel Sebastián','Rodríguez Benítez','2006-12-02','Calle 115 A sur# 7-23','sebasgamerrodriguez@gmail.com','2328746','3108749897','M','O+','Capital Salud','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1028783254','Tarjeta de identidad','Yojan Mauricio ','Coronado Ramírez','2006-03-21','Calle 95 a # 14 j 36','Ninguno','Ninguno','3007277016','M','O+','Sura','Ninguna','Estudiante')");
        db.execSQL("insert into personas values('1022990714','Tarjeta de identidad','Juan Felipe','Terreros Agudelo','2011-10-08','Calle 116 A Sur # 8 A 32','minipolli2006@hotmail.com','Ninguno','3203774021','M','O+','Capital Salud','Ninguna','Estudiante')");


    }
}
