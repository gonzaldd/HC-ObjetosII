

/*login*/
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values
(1111,'abc1111','2015-05-24', '2015-04-01', 1,true),
(2222,'abd2222','2015-05-24', '2015-04-01', 2,true),
(3333,'abc3333','2015-05-24', '2015-04-01', 2,true),
(4444,'abc4444','2015-05-24', '2015-04-01', 2,true),
(5555,'abc5555','2015-05-24', '2015-04-01', 2,true),
(6666,'abc6666','2015-05-24', '2015-04-01', 0,true),
(7777,'abc7777','2015-05-24', '2015-04-01', 0,true),
(8888,'abc8888','2015-05-24', '2015-04-01', 0,true),
(9999,'abc9999','2015-05-24', '2015-04-01', 0,true),
(1010,'abc1010','2015-05-24', '2015-04-01', 0,true),
(1212,'abc1212','2015-05-24', '2015-04-01', 0,true),
(71313,'abc1313','2015-05-24', '2015-04-01', 0,true),
(1414,'abc1414','2015-05-24', '2015-04-01', 0,true),
(1515,'abc1515','2015-05-24', '2015-04-01', 0,true),
(1616,'abc1616','2015-05-24', '2015-04-01', 0,true);


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
('Elba','Salgado',true,11112222);

/*categoria de consulta*/
insert into categoriadeconsulta values
(1,'riña callejera'),
(2,'accidente vial'),
(3,'intoxicacion'),
(4,'descompensacion en via publica'),
(5,'herida de arma blaca'),
(6,'herida de bala');

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

/*area*/
insert into area values
(1,'Urgencias',''),
(2,'Consutorios Externos',''),
(3,'Terapia Intensiva',''),
(4,'Maternidad',''),
(5,'Analisis Clinicos',''),
(6,'Quirofanos','');

/*especialidad*/
insert into especialidad(idArea,nombreEspecialidad,descripcionEspecialidad) values
(1,'cardiologo', ''),
(1,'medico clinico', ''),
(2,'enfermera', ''),
(3,'traumatologo', ''),
(4,'medico residente', ''),
(5,'psiquiatra', ''),
(6,'cirujano', '');


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
(14,'Mirta', 'Renzo', 55555555, 14);

/*contacto profesional*/
insert into contactoprofesional values
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

/*consulta*/
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values
(1,1,1,'2013-01-01',"fractura de tibia y perone; luxacion de hombro"),
(1,2,4,'2014-08-15',"presion baja"),
(1,1,1,'2015-02-04',"golpes en abdomen y fractura de dos costillas"),
(2,8,2,'2015-01-01',"traumatismo cervical"),
(2,11,5,'2015-01-01',"perforacion de pulmon derecho"),
(2,2,4,'2015-01-01',"desmayo.Se realizaran analisis"),
(3,3,6,'2015-01-01',"herida de bala en pierna derecha"),
(3,3,5,'2015-01-01',"corta superficial en cara, se le daran puntos de sutura."),
(3,10,1,'2015-01-01',"traumatismo de craneo"),
(4,4,5,'2015-01-01',"gripe"),
(4,9,2,'2015-01-01',"varicela"),
(4,4,2,'2015-01-01',"tarumatismo de torax"),
(5,8,3,'2015-01-01',"anorexia"),
(5,1,3,'2015-01-01',"baja presion"),
(5,14,3,'2015-01-01',"desmayo"),
(6,2,1,'2015-01-01',"golpes en abdomen"),
(6,13,2,'2015-01-01',"fractura de clavicula"),
(6,3,6,'2015-01-01',"perforacion y sangrado de intestino"),
(7,7,2,'2015-01-01',"bajos niveles de azucar en sangre"),
(7,1,2,'2015-01-01',"vomitos y diarrea"),
(7,10,2,'2015-01-01',"desmayo"),
(8,3,1,'2015-01-01',"tarumatismo de torax"),
(8,13,3,'2015-01-01',"dolores agudos de estomago"),
(8,2,2,'2015-01-01',"traumatismo de craneo"),
(9,9,4,'2015-01-01',"Fiebre y estado gripal"),
(9,4,3,'2015-01-01',"coma alcoholico"),
(9,10,5,'2015-01-01',"herida cortante en cuello"),
(10,3,4,'2015-01-01',"Faringitis aguda"),
(10,7,2,'2015-01-01',"traumatismo de craneo"),
(10,12,6,'2015-01-01',"perforacion y sangrado de pulmon derecho");

