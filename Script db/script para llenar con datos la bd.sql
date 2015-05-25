

/*login*/
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(1111,'abc1111','2015-05-24', '2015-04-01', 1,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(2222,'abd2222','2015-05-24', '2015-04-01', 2,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(3333,'abc3333','2015-05-24', '2015-04-01', 2,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(4444,'abc4444','2015-05-24', '2015-04-01', 2,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(5555,'abc5555','2015-05-24', '2015-04-01', 3,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(6666,'abc6666','2015-05-24', '2015-04-01', 3,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(7777,'abc7777','2015-05-24', '2015-04-01', 3,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(8888,'abc8888','2015-05-24', '2015-04-01', 4,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(9999,'abc9999','2015-05-24', '2015-04-01', 4,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(1010,'abc1010','2015-05-24', '2015-04-01', 4,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(1212,'abc1212','2015-05-24', '2015-04-01', 3,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(71313,'abc1313','2015-05-24', '2015-04-01', 3,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(1414,'abc1414','2015-05-24', '2015-04-01', 4,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(1515,'abc1515','2015-05-24', '2015-04-01', 4,true);
insert into login(usuarioLogin,claveLogin,ultimoIngresoLogin,ultimoCambioClaveLogin,tipoUsuario,activoLogin) values(1616,'abc1616','2015-05-24', '2015-04-01', 4,true);


/*paciente*/
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values('Juan','Perez',true,11111111);
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values('Sofia','Gomez',true,22222222);
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values('Pablo','Ramirez',true,33333333);
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values('Clara','Delgado',true,44444444);
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values('Jose','Ruiz',true,55555555);
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values('Laura','Gonzalez',true,66666666);
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values('Fabian','Lopez',true,77777777);
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values('Cristina','Poblete',true,88888888);
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values('Ricardo','Centurion',true,99999999);
insert into paciente(nombrePaciente, apellidoPaciente,activoPaciente, dniPaciente) values('Elba','Salgado',true,11112222);

/*categoria de consulta*/
insert into categoriadeconsulta values(1,'riña callejera');
insert into categoriadeconsulta values(2,'accidente vial');
insert into categoriadeconsulta values(3,'intoxicacion');
insert into categoriadeconsulta values(4,'descompensacion en via publica');
insert into categoriadeconsulta values(5,'herida de arma blaca');
insert into categoriadeconsulta values(6,'herida de bala');

/*contacto paciente*/
insert into contactopaciente values(1,'1511111111','Laprida 123', 'jp@gmail.com','1972-08-21','arg');
insert into contactopaciente values(2,'1522222222','Loria 456', 'sg@gmail.com','1985-01-05','arg');
insert into contactopaciente values(3,'1533333333','J B Justo 890', 'pr@gmail.com','1945-06-15','arg');
insert into contactopaciente values(4,'1544444444','Bolaños 521', 'cd@gmail.com','1995-11-22','arg');
insert into contactopaciente values(5,'1555555555','San Martin 180', 'jr@gmail.com','1975-04-09','arg');
insert into contactopaciente values(6,'1566666666','Yapeyu 789', 'lg@gmail.com','1996-05-25','arg');
insert into contactopaciente values(7,'1577777777','Balcarce 723', 'fl@gmail.com','1986-12-04','arg');
insert into contactopaciente values(8,'1588888888','Misiones 259', 'cp@gmail.com','1959-08-18','arg');
insert into contactopaciente values(9,'1599999999','Tucuman 1028', 'rc@gmail.com','1972-03-26','arg');
insert into contactopaciente values(10,'1510101010','9 De Julio 256', 'es@gmail.com','1999-08-14','arg');

/*area*/
insert into area values(1,'Urgencias','');
insert into area values(2,'Consutorios Externos','');
insert into area values(3,'Terapia Intensiva','');
insert into area values(4,'Maternidad','');
insert into area values(5,'Analisis Clinicos','');
insert into area values(6,'Quirofanos','');

/*especialidad*/
insert into especialidad(idArea,nombreEspecialidad,descripcionEspecialidad) values(1,'cardiologo', '');
insert into especialidad(idArea,nombreEspecialidad,descripcionEspecialidad) values(1,'medico clinico', '');
insert into especialidad(idArea,nombreEspecialidad,descripcionEspecialidad) values(2,'enfermera', '');
insert into especialidad(idArea,nombreEspecialidad,descripcionEspecialidad) values(3,'traumatologo', '');
insert into especialidad(idArea,nombreEspecialidad,descripcionEspecialidad) values(4,'medico residente', '');
insert into especialidad(idArea,nombreEspecialidad,descripcionEspecialidad) values(5,'psiquiatra', '');
insert into especialidad(idArea,nombreEspecialidad,descripcionEspecialidad) values(6,'cirujano', '');


/*profesional*/
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(1,1111,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(1,2222,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(2,3333,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(2,4444,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(3,5555,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(3,6666,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(4,7777,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(4,8888,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(5,9999,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(5,1010,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(6,1212,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(6,1313,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(7,1414,true);
insert into profesional(idEspecialidad,matriculaProfesional,activoProfesional) values(7,1515,true);

/*usuario*/
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(1,'root', 'root', 55555555, 1);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(2,'Carlos', 'Luna', 55555555, 2);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(3,'Beatriz', 'Gimenez', 55555555, 3);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(4,'Lara', 'Cruz', 55555555, 4);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(5,'Enrique', 'Jaime', 55555555, 5);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(6,'Pedro', 'Aldao', 55555555, 6);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(7,'Juliana', 'Valentin', 55555555, 7);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(8,'Celeste', 'Gomez', 55555555, 8);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(9,'Pablo', 'Guino', 55555555, 9);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(10,'Federico', 'Ramirez', 55555555, 10);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(11,'Laura', 'Hache', 55555555, 11);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(12,'Mariana', 'Fernandez', 55555555, 12);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(13,'Julio', 'Paz', 55555555, 13);
insert into usuario(idLogin, nombreUsuario, apellidoUsuario, dniUsuario, idProfesional) values(14,'Mirta', 'Renzo', 55555555, 14);

/*contacto profesional*/
insert into contactoprofesional values(1,'1512121212','Azcuenaga 789 ','prof1@gfdgdf.com', '1956-08-21');
insert into contactoprofesional values(2,'1513131313','Tolasa 123', 'prof2@gfdgdf.com', '1972-10-08');
insert into contactoprofesional values(3,'1514141414','Formosa 1059', 'prof3@gfdgdf.com', '1986-02-25');
insert into contactoprofesional values(4,'1515151515','Granaderos 871', 'prof4@gfdgdf.com', '1966-05-15');
insert into contactoprofesional values(5,'1516161616','Balcace 421', 'prof5@gfdgdf.com', '1980-01-01');
insert into contactoprofesional values(6,'1517171717','Belgrano 875', 'prof6@gfdgdf.com', '1981-07-18');
insert into contactoprofesional values(7,'1518181818','Chaco 2569', 'prof7@gfdgdf.com', '1976-04-21');
insert into contactoprofesional values(8,'1519191919','Fray Bentos 456', 'prof8@gfdgdf.com', '1970-05-13');
insert into contactoprofesional values(9,'1521212121','Lujan 963', 'prof9@gfdgdf.com', '1978-09-10');
insert into contactoprofesional values(10,'1523232323','25 deMayo 759', 'prof10@gfdgdf.com', '1965-06-09');
insert into contactoprofesional values(11,'1524242424','Uriarte 478', 'prof11@gfdgdf.com', '1974-08-09');
insert into contactoprofesional values(12,'1525252525','Zarate 1028', 'prof12@gfdgdf.com', '1964-11-06');
insert into contactoprofesional values(13,'1526262626','Bariloche 512', 'prof13@gfdgdf.com', '1985-06-05');
insert into contactoprofesional values(14,'1527272727','Yrigoyen 2048', 'prof14@gfdgdf.com', '1961-02-22');

/*consulta*/
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(1,1,1,'2013-01-01',"fractura de tibia y perone; luxacion de hombro");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(1,2,4,'2014-08-15',"presion baja");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(1,1,1,'2015-02-04',"golpes en abdomen y fractura de dos costillas");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(2,8,2,'2015-01-01',"traumatismo cervical");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(2,11,5,'2015-01-01',"perforacion de pulmon derecho");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(2,2,4,'2015-01-01',"desmayo.Se realizaran analisis");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(3,3,6,'2015-01-01',"herida de bala en pierna derecha");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(3,3,5,'2015-01-01',"corta superficial en cara, se le daran puntos de sutura.");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(3,10,1,'2015-01-01',"traumatismo de craneo");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(4,4,5,'2015-01-01',"gripe");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(4,9,2,'2015-01-01',"varicela");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(4,4,2,'2015-01-01',"tarumatismo de torax");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(5,8,3,'2015-01-01',"anorexia");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(5,1,3,'2015-01-01',"baja presion");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(5,14,3,'2015-01-01',"desmayo");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(6,2,1,'2015-01-01',"golpes en abdomen");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(6,13,2,'2015-01-01',"fractura de clavicula");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(6,3,6,'2015-01-01',"perforacion y sangrado de intestino");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(7,7,2,'2015-01-01',"bajos niveles de azucar en sangre");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(7,1,2,'2015-01-01',"vomitos y diarrea");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(7,10,2,'2015-01-01',"desmayo");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(8,3,1,'2015-01-01',"tarumatismo de torax");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(8,13,3,'2015-01-01',"dolores agudos de estomago");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(8,2,2,'2015-01-01',"traumatismo de craneo");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(9,9,4,'2015-01-01',"Fiebre y estado gripal");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(9,4,3,'2015-01-01',"coma alcoholico");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(9,10,5,'2015-01-01',"herida cortante en cuello");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(10,3,4,'2015-01-01',"Faringitis aguda");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(10,7,2,'2015-01-01',"traumatismo de craneo");
insert into consulta(idPaciente,idProfesional,idCategoriaDeConsulta,fechaDeAtencion, diagnostico) values(10,12,6,'2015-01-01',"perforacion y sangrado de pulmon derecho");

