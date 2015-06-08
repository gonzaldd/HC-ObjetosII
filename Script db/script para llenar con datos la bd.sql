/*area*/
insert into area values
(1,'Urgencias',''),
(2,'Consutorios externos',''),
(3,'Terapia intensiva',''),
(4,'Maternidad',''),
(5,'Analisis Clínicos',''),
(6,'Quirofanos','');

/*categoria de consulta*/
insert into categoriadeconsulta values
(1,'Riña callejera'),
(2,'Accidente vial'),
(3,'Intoxicación'),
(4,'Descompensación en vía pública'),
(5,'Herida de arma blanca'),
(6,'Herida de bala');


/*especialidad*/
insert into especialidad(idArea,nombreEspecialidad,descripcionEspecialidad) values
(1,'Cardiologo', ''),
(1,'Médico clínico', ''),
(2,'Enfermera', ''),
(3,'Traumatólogo', ''),
(4,'Medico residente', ''),
(5,'Psiquiatra', ''),
(6,'Cirujano', '');

/*profesional*/
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values
(1,1111,true),
(1,2222,true),
(2,3333,true),
(2,4444,true),
(3,5555,true),
(3,6666,true),
(4,7777,true),
(4,8888,true),
(5,9999,true),
(5,1010,true),
(6,1212,true),
(6,1313,true),
(7,1414,true),
(7,1515,true);

/*paciente*/
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values
('Juan','Perez',true,11111111),
('Sofia','Gomez',true,22222222),
('Pablo','Ramirez',true,33333333),
('Clara','Delgado',true,44444444),
('Jose','Ruiz',true,55555555),
('Laura','Gonzalez',true,66666666),
('Fabian','Lopez',true,77777777),
('Cristina','Poblete',true,88888888),
('Ricardo','Centurion',true,99999999),
('Bruno','Barros',true,12345678),
('Sebastián','Cascardo',true,10101010),
('Gonzalo','De Domingo',true,12121212),
('Esteban','Rodriguez',true,13131313),
('Carlos','Garcia',true,14141414),
('Juan','Lennon',true,15151515),
('Pepe','Tet',true,16161616),
('Alberto','Quintanilla',true,17171717),
('Ricardo','Solari',true,18181818),
('Felipe','Sanchez',true,19191919);

/*consulta*/
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values
(1,1,1,'2013-01-01',"Fractura de tibia y perone luxación de hombro"),
(1,2,4,'2014-08-15',"Luxación de hombro"),
(1,2,4,'2014-08-15',"Presión baja"),
(1,1,1,'2015-02-04',"Golpes en abdomen y fractura de dos costillas"),
(2,8,2,'2015-01-01',"Traumatismo cervical"),
(2,11,5,'2013-04-01',"Perforación y sangrado de pulmón derecho"),
(2,2,4,'2015-05-01',"Desmayo. Se realizarán análisis"),
(3,3,6,'2011-01-03',"Herida de bala en pierna derecha"),
(3,3,5,'2015-02-09',"Corte superficial en la cara, se le darán puntos de sutura"),
(3,10,1,'2015-01-01',"Traumatismo de craneo"),
(4,4,5,'2011-02-04',"Gripe con mucha fiebre, se le darán 2 días de reposo en cama"),
(4,9,2,'2015-03-21',"Varicela"),
(4,4,2,'2012-04-11',"Traumatismo de torax"),
(5,8,3,'2013-05-21',"Anorexia"),
(5,1,3,'2014-06-11',"Baja presión"),
(5,14,3,'2010-07-30',"ACV, se deja en terapia"),
(6,2,1,'2013-08-21',"Cancer de pulmón"),
(6,13,2,'2012-09-12',"Fractura de clavícula"),
(6,3,6,'2011-10-15',"Perforación y sangrado de intestino"),
(7,7,2,'2011-11-01',"Bajos niveles de azucar en sangre"),
(7,1,2,'2011-12-14',"Vómitos y diarrea"),
(7,10,2,'2014-11-05',"Dolor de muela"),
(8,3,1,'2014-06-02',"Dolor fuerte de garganta"),
(8,13,3,'2013-08-03',"Dolores agudos de estómago"),
(8,2,2,'2011-03-08',"Traumatismo de cráneo"),
(9,9,4,'2015-04-07',"Fiebre y estado gripal"),
(9,4,3,'2011-04-06',"Coma alcohólico"),
(9,10,5,'2012-11-05',"Herida cortante en cuello"),
(10,3,4,'2015-03-01',"Faringitis aguda"),
(10,7,2,'2012-11-06',"Traumatismo de craneo"),
(10,12,6,'2012-06-16',"Perforación y sangrado de pulmon derecho"),
(11,10,5,'2015-05-17',"Herida cortante en cuello"),
(11,3,4,'2015-04-01',"Fiebre y estado gripal"),
(11,7,2,'2012-03-25',"Golpes en todo el cuerpo, accidente vehicular"),
(12,10,5,'2015-02-17',"Dolor fuerte de garganta"),
(12,3,4,'2015-01-19',"Arritmia ventricular"),
(12,7,2,'2013-08-01',"Locura temporal, probable esquizofrenia paranoide"),
(13,10,5,'2012-09-01',"Intentos varios y variados de suicidios"),
(13,3,4,'2011-08-15',"Sobredosis de cocaína"),
(13,7,2,'2013-04-13',"Probable alergia a los animales"),
(14,10,5,'2015-02-01',"Psicópata, directo al loquero"),
(14,3,1,'2015-03-16',"Debe ir al urólogo, traerá resultados"),
(14,7,2,'2013-04-18',"Traumatismo de craneo"),
(15,10,3,'2015-05-01',"Accidente en la obra, perdió ambas piernas"),
(15,3,2,'2015-04-17',"Ira narcisista"),
(15,7,6,'2013-07-15',"Traumatismo de craneo"),
(16,10,5,'2015-02-01',"Desmayo. Se realizarán análisis"),
(16,3,4,'2013-05-12',"Gripe con mucha fiebre, se le darán 2 días de reposo en cama"),
(16,7,2,'2011-01-13',"Arritmia ventricular"),
(17,10,5,'2015-01-30',"Probable alergia a los animales"),
(17,3,6,'2014-02-01',"Faringitis aguda"),
(17,7,2,'2013-05-07',"Traumatismo de craneo"),
(18,10,5,'2011-06-25',"Baja presión"),
(18,3,4,'2013-08-22',"Faringitis aguda"),
(18,7,5,'2015-04-21',"Traumatismo de craneo"),
(19,10,1,'2014-07-09',"Desmayo. Se realizarán análisis"),
(19,3,4,'2008-09-09',"Baja presión"),
(19,7,2,'2012-04-08',"Gripe con mucha fiebre, se le darán 2 días de reposo en cama");








/*contacto paciente*/

insert into contactopaciente values
(1,'1511111111','Laprida 123', 'jp@gmail.com','1972-08-21','arg'),
(2,'1522222222','Loria 456', 'sg@gmail.com','1985-01-05','arg'),
(3,'1533333333','J B Justo 890', 'pr@gmail.com','1945-06-15','arg'),
(4,'1544444444','Bolaños 521', 'cd@gmail.com','1995-11-22','arg'),
(5,'1555555555','San Martin 180', 'jr@gmail.com','1975-04-09','arg'),
(6,'1566666666','Yapeyu 789', 'lg@gmail.com','1996-05-25','arg'),
(7,'1577777777','Balcarce 723', 'fl@gmail.com','1986-12-04','arg'),
(8,'1588888888','Misiones 259', 'cp@gmail.com','1959-08-18','arg'),
(9,'1599999999','Tucuman 1028', 'rc@gmail.com','1972-03-26','arg'),
(10,'1510101010','9 De Julio 256', 'es@gmail.com','1999-08-14','arg');







/*contacto profesional*/
insert into contactoprofesional (idProfesional,telefonoProfesional,direccionProfesional,mailProfesional, fechaDeNacimiento) values
(1,'1512121212','Azcuenaga 789 ','prof1@gfdgdf.com', '1956-08-21'),
(2,'1513131313','Tolasa 123', 'prof2@gfdgdf.com', '1972-10-08'),
(3,'1514141414','Formosa 1059', 'prof3@gfdgdf.com', '1986-02-25'),
(4,'1515151515','Granaderos 871', 'prof4@gfdgdf.com', '1966-05-15'),
(5,'1516161616','Balcace 421', 'prof5@gfdgdf.com', '1980-01-01'),
(6,'1517171717','Belgrano 875', 'prof6@gfdgdf.com', '1981-07-18'),
(7,'1518181818','Chaco 2569', 'prof7@gfdgdf.com', '1976-04-21'),
(8,'1519191919','Fray Bentos 456', 'prof8@gfdgdf.com', '1970-05-13'),
(9,'1521212121','Lujan 963', 'prof9@gfdgdf.com', '1978-09-10'),
(10,'1523232323','25 deMayo 759', 'prof10@gfdgdf.com', '1965-06-09'),
(11,'1524242424','Uriarte 478', 'prof11@gfdgdf.com', '1974-08-09'),
(12,'1525252525','Zarate 1028', 'prof12@gfdgdf.com', '1964-11-06'),
(13,'1526262626','Bariloche 512', 'prof13@gfdgdf.com', '1985-06-05'),
(14,'1527272727','Yrigoyen 2048', 'prof14@gfdgdf.com', '1961-02-22');


/*login*/
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values
(1111,'abc1111','2015-05-24', '2015-04-01', 1,true),
(2222,'abc2222','2015-05-24', '2015-04-01', 2,true),
(3333,'abc3333','2015-05-24', '2015-04-01', 2,true),
(4444,'abc4444','2015-05-24', '2015-04-01', 2,true),
(5555,'abc5555','2015-05-24', '2015-04-01', 2,true),
(6666,'abc6666','2015-05-24', '2015-04-01', 0,true),
(7777,'abc7777','2015-05-24', '2015-04-01', 0,true),
(8888,'abc8888','2015-05-24', '2015-04-01', 0,true),
(9999,'abc9999','2015-05-24', '2015-04-01', 0,true),
(1010,'abc1010','2015-05-24', '2015-04-01', 0,true),
(1212,'abc1212','2015-05-24', '2015-04-01', 0,true),
(1313,'abc1313','2015-05-24', '2015-04-01', 0,true),
(1414,'abc1414','2015-05-24', '2015-04-01', 0,true),
(1515,'abc1515','2015-05-24', '2015-04-01', 0,true),
(1616,'abc1616','2015-05-24', '2015-04-01', 0,true),
(1717,'abc1717','2015-05-24', '2015-04-01', 0,true),
(1818,'abc1818','2015-05-24', '2015-04-01', 0,true),
(1919,'abc1919','2015-05-24', '2015-04-01', 0,true),
(35686181,'35686181g','2015-05-24', '2015-04-01', 0,true),
(37686735,'37686735b','2015-05-24', '2015-04-01', 0,true),
(36982749,'36982749e','2015-05-24', '2015-04-01', 0,true);

/*usuario*/
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values
(1,'root', 'root', 55555555, 1),
(2,'Carlos', 'Luna', 55555555, 2),
(3,'Beatriz', 'Gimenez', 55555555, 3),
(4,'Lara', 'Cruz', 55555555, 4),
(5,'Enrique', 'Jaime', 55555555, 5),
(6,'Pedro', 'Aldao', 55555555, 6),
(7,'Juliana', 'Valentin', 55555555, 7),
(8,'Celeste', 'Gomez', 55555555, 8),
(9,'Pablo', 'Guino', 55555555, 9),
(10,'Federico', 'Ramirez', 55555555, 10),
(11,'Laura', 'Hache', 55555555, 11),
(12,'Mariana', 'Fernandez', 55555555, 12),
(13,'Julio', 'Paz', 55555555, 13),
(14,'Mirta', 'Renzo', 55555555, 14),
(15,'Mirta', 'Renzo', 55555555, 14),
(16,'Mirta', 'Renzo', 55555555, 14),
(17,'Mirta', 'Renzo', 55555555, 14),
(18,'Mirta', 'Renzo', 55555555, 14),
(19,'Gonzalo', 'De Domingo', 55555555, 2),
(20,'Bruno', 'Barros', 55555555, 3),
(21,'Esteban', 'Rodriguez', 55555555, 4);










