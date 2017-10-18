drop database if exists ProjectISS;
create database ProjectISS;
use ProjectISS;

create table State(
IdState bigint primary key auto_increment not null ,
NameEstate varchar(10) not null unique
);

insert into State values("","Activo");

insert into State values("","Inactivo");

create table ActivityType(
IdActivityType bigint primary key not null auto_increment,
NameActivityType varchar(60) not null 
);

Insert Into ActivityType values("","Academica");

Insert Into ActivityType values("","Administrativa");

Create table NeighBorhood(
IdNeighBorhood bigint primary key not null auto_increment,
NameNeighBorhood varchar(80) not null
);

Insert into NeighBorhood values("","Canaima");

Insert into NeighBorhood values("","La floresta de La Sabana");

Insert into NeighBorhood values("","Torca");

Insert into NeighBorhood values("","Alto de serrezuela");

Insert into NeighBorhood values("","Balciones de vista hermonsa");

Insert into NeighBorhood values("","Balmoral Norte");

Insert into NeighBorhood values("","Buenavista");

Insert into NeighBorhood values("","Chaparral");

Insert into NeighBorhood values("","El codito");

Insert into NeighBorhood values("","El refugio de san antonio");

Insert into NeighBorhood values("","El verbenal");

Insert into NeighBorhood values("","Horizontes");

Insert into NeighBorhood values("","La estrellita");

Insert into NeighBorhood values("","La frontera");

Insert into NeighBorhood values("","La llanurita");

Insert into NeighBorhood values("","Los consuelos");

Insert into NeighBorhood values("","Maranta");

Insert into NeighBorhood values("","Maturin");

Insert into NeighBorhood values("","Medellin");

Insert into NeighBorhood values("","Mirador del nrte");

Insert into NeighBorhood values("","San antonio Norte");

Insert into NeighBorhood values("","Santa Felisia");

Insert into NeighBorhood values("","Santandersito");

Insert into NeighBorhood values("","Tibata");

Insert into NeighBorhood values("","Viña del mar");

Insert into NeighBorhood values("","Bosque de san antonio");

Insert into NeighBorhood values("","Conjunto camino del palmar");

Insert into NeighBorhood values("","El pite");

Insert into NeighBorhood values("","El redil");

Insert into NeighBorhood values("","La gita");

Insert into NeighBorhood values("","La granja norte");

Insert into NeighBorhood values("","La uribe");

Insert into NeighBorhood values("","Los naranjos");

Insert into NeighBorhood values("","San juan bosco");

Insert into NeighBorhood values("","Urbanizacion los laurales");

Insert into NeighBorhood values("","Ainsuca");

Insert into NeighBorhood values("","Altablanca");

Insert into NeighBorhood values("","Barrancas");

Insert into NeighBorhood values("","California");

Insert into NeighBorhood values("","Cerro norte");

Insert into NeighBorhood values("","Danubio");

Insert into NeighBorhood values("","Don bosco");

Insert into NeighBorhood values("","La perla oriental");

Insert into NeighBorhood values("","Las areneras");

Insert into NeighBorhood values("","Milan(Barrancas)");

Insert into NeighBorhood values("","San cristobal norte");

Insert into NeighBorhood values("","Santa cecilia norte parta alta");

Insert into NeighBorhood values("","Santa cecilia parte baja");

Insert into NeighBorhood values("","Santa teresa");

Insert into NeighBorhood values("","Sorotama");

Insert into NeighBorhood values("","Torcorama");

Insert into NeighBorhood values("","Villa nydia");

Insert into NeighBorhood values("","Villa Olivia");

Insert into NeighBorhood values("","El Toberin");

Insert into NeighBorhood values("","Babilonia");

Insert into NeighBorhood values("","Dardanelos");

Insert into NeighBorhood values("","Estrella del norte");

Insert into NeighBorhood values("","Guanoa");

Insert into NeighBorhood values("","Jardin norte");

Insert into NeighBorhood values("","La liberia");

Insert into NeighBorhood values("","La pradera norte");

Insert into NeighBorhood values("","Las orquideas");

Insert into NeighBorhood values("","Pantanito");

Insert into NeighBorhood values("","Santa monica");

Insert into NeighBorhood values("","Villa magdala");

Insert into NeighBorhood values("","Villa de aranjuez");

Insert into NeighBorhood values("","Villas del mediterraneo");

Insert into NeighBorhood values("","Zaragoza");

Insert into NeighBorhood values("","Acacias");

Insert into NeighBorhood values("","Antigua");

Insert into NeighBorhood values("","Belmira");

Insert into NeighBorhood values("","Bosque del pin");

Insert into NeighBorhood values("","Caoboz Salas");

Insert into NeighBorhood values("","Capri");

Insert into NeighBorhood values("","Cedritos");

Insert into NeighBorhood values("","Cedro boliviar");

Insert into NeighBorhood values("","Cedro golf");

Insert into NeighBorhood values("","Cedro madeir");

Insert into NeighBorhood values("","Cedro narvae");

Insert into NeighBorhood values("","Cedro salaza");

Insert into NeighBorhood values("","El Contador");

Insert into NeighBorhood values("","El Rincon deL");

Insert into NeighBorhood values("","La Sonora");

Insert into NeighBorhood values("","Las margaritas");

Insert into NeighBorhood values("","Lisboa de Usaquen");

Insert into NeighBorhood values("","Los cedros");

Insert into NeighBorhood values("","Los cedros o");

Insert into NeighBorhood values("","Montearroyo");

Insert into NeighBorhood values("","NuevaAutopista");

create table TypeTrainingProgram(
IdTypeTrainingProgram bigint primary key auto_increment not null,
NameTypeTrainingProgram varchar(60) not null unique
);

insert into TypeTrainingProgram values("","Tecnologo");

insert into TypeTrainingProgram values("","Tecnico");

create table TrainingProgram(
IdTrainingProgram bigint primary key auto_increment not null,
NameTrainingProgram varchar(70) not null unique,
fkTypeTrainingProgram bigint not null,
Constraint fk_TypeTrainingProgram Foreign key (fkTypeTrainingProgram) references TypeTrainingProgram(IdTypeTrainingProgram)
);

insert into TrainingProgram values("","ADSI",1);

insert into TrainingProgram values("","PSW",2);

insert into TrainingProgram values("","MEC",2);

insert into TrainingProgram values("","MECDCE",1);

insert into TrainingProgram values("","EA",2);

insert into TrainingProgram values("","DIM",2);

Create table TypeSpaceFormation(
IdTypeSpaceFormation bigint primary key auto_increment not null,
NameSpaceFormation varchar(55) not null unique
);

insert into TypeSpaceFormation values("","Privado");

insert into TypeSpaceFormation values("","Publico");

insert into TypeSpaceFormation values("","Centro");

Create table Locality(
IdLocality bigint primary key not null auto_increment,
NameLocality varchar(55) unique not null
);

insert Into Locality values("","Usaquen");

insert Into Locality values("","Chapinero");

insert Into Locality values("","SantaFe");

insert Into Locality values("","San Cristobal");

insert Into Locality values("","Usme");

insert Into Locality values("","Tunjuelito");

insert Into Locality values("","Bosa");

insert Into Locality values("","Kenedy");

insert Into Locality values("","Fontibon");

insert Into Locality values("","Engativa");

insert Into Locality values("","Suba");

insert Into Locality values("","Barrios Unidos");

insert Into Locality values("","Teusaquillo");

insert Into Locality values("","Los Martires");

insert Into Locality values("","Antonio Nariño");

insert Into Locality values("","Puente Aranda");

insert Into Locality values("","La Candelaria");

insert Into Locality values("","Rafael Uribe Uribe");

insert Into Locality values("","Ciudad Bolivar");

insert Into Locality values("","Sumapaz");

Create table AreaSena(
IdAreaSena bigint primary key auto_increment not null,
NameArea varchar(75) unique not null
);

insert into AreaSena values("","TeleInformatica");

insert into AreaSena values("","Mercadeo");

insert into AreaSena values("","Logistica");

create table Phone(
IdPhone bigint primary key auto_increment not null,
phonenumber bigint not null unique
);


insert into Phone values("",3134234235);

insert into Phone values("",3150921832);

insert into Phone values("",3133241124);

insert into Phone values("",3112345235);

insert into Phone values("",3107894221);

insert into Phone values("",3149280211);

insert into Phone values("",3153464678);

insert into Phone values("",3133234564);

insert into Phone values("",3135678895);

insert into Phone values("",3122267905);

create table WorkingDay(
IdWorkingDay bigint primary key auto_increment not null,
WorkingDayName varchar(50) unique not null,
StartTime Time not null,
FinishTime Time not null
);

insert into WorkingDay values("","Mañana",'06:30:00','12:30:00');

insert into WorkingDay values("","Tarde",'12:30:00','05:30:00');

insert into WorkingDay values("","Noche",'05:30:00','9:30:00');

create table Rol(
Idrol bigint primary key auto_increment not null,
NameRol varchar(20) not null unique
);

insert into Rol values("","Administrador");

insert into Rol values("","InstructorGuia");

insert into Rol values("","Lider");

insert into Rol values("","Coordinador");

insert into Rol values("","Instructor");

create table TypeGroup(
IdTypeGroup bigint primary key auto_increment not null,
NameTypeGroup varchar(45) unique not null
);

insert into TypeGroup values("","Tecnico");

insert into TypeGroup values("","Tecnologo");

create table Groupp(
IdGroup bigint primary key not null,
ApprenticesNumber bigint not null,
fkState bigint not null,
fkTypeGroup bigint not null,
fkTrainingProgram bigint not null,
fkAreaSena bigint not null,
Constraint fk_AreaSena Foreign key (fkAreaSena) references AreaSena(IdAreaSena),
Constraint fk_TypeGroup Foreign key (fkTypeGroup) references TypeGroup(IdTypeGroup),
Constraint fk_State Foreign key (fkState) references State(IdState),
Constraint fk_TrainingProgram Foreign key (fkTrainingProgram) references TrainingProgram(IdTrainingProgram)
);


insert into Groupp values(1344690,21,1,1,1,1);

insert into Groupp values(1356743,12,1,2,2,1);

insert into Groupp values(1356741,23,1,2,2,3);

insert into Groupp values(1356724,32,1,2,2,1);

insert into Groupp values(1356731,34,1,1,1,2);

insert into Groupp values(1350988,43,2,1,6,3);

insert into Groupp values(1045567,24,2,1,5,2);

insert into Groupp values(1407012,41,2,2,3,1);

insert into Groupp values(1211790,33,1,2,6,2);

insert into Groupp values(1140387,16,2,2,4,1);


create table UserP(
IdUser bigint primary key not null,
PasswordU varchar(30) not null unique
);

insert into UserP values(1007249256,"aass");


create table Person(
IdPerson bigint Primary key not null,
PersonNameVarchar varchar(45) not null,
Address varchar(45) not null,
fkLocality bigint not null,
fkNeighborhood bigint not null,
Email varchar(55) not null unique,
fkPhoneNumber bigint not null,
fkUserP bigint not null,
fkRol bigint not null,
Constraint fk_Rol Foreign key (fkRol) references Rol(IdRol),
Constraint fk_Locality Foreign key (fkLocality) references Locality(IdLocality),
Constraint fk_Neighborhood Foreign key (fkNeighborhood) references NeighBorhood(IdNeighBorhood),
Constraint fk_user Foreign key (fkUserP) references UserP(IdUser),
Constraint fk_Phone Foreign key (fkPhoneNumber) references Phone(IdPhone)
);

insert into Person values(1007249256,"Juan","Calle 1",1,2,"Juan@Hotmail.com",1,1007249256,1);

create table SpaceFormation(
IdSpaceFormation bigint primary key auto_increment not null,
SpaceFormation varchar(100) not null,
fkTypeSpaceFormation bigint not null,
Constraint fk_TypeSpaceFormation Foreign key (fkTypeSpaceFormation) references TypeSpaceFormation(IdTypeSpaceFormation)
);

insert into SpaceFormation values ("","Informatica2",1);

insert into SpaceFormation values ("","Informatica1",2);

insert into SpaceFormation values ("","Tecnologia",3);

insert into SpaceFormation values ("","Laboratorio",1);

insert into SpaceFormation values ("","Sala Informatica Primer Piso",2);

insert into SpaceFormation values ("","I1",1);

insert into SpaceFormation values ("","Tec1",1);

insert into SpaceFormation values ("","TecSena1",3);

insert into SpaceFormation values ("","Tecnologia 4",3);

insert into SpaceFormation values ("","Informatica 3",2);

Create table Institute(
IdInstitute bigint primary key auto_increment not null,
NameInstitute varchar(80) not null,
Headquarters varchar(70) not null,
Address varchar(100) not null unique,
Email varchar(200) not null unique,
fkInstitutePhone bigint not null unique,
fkSpaceFormation bigint not null,
fkNeighborhood bigint not null,
fkLocality bigint not null,
Constraint fk_Phone1 Foreign key (fkInstitutePhone) references Phone(IdPhone),
Constraint fk_SpaceFormation1 Foreign key (fkSpaceFormation) references SpaceFormation(IdSpaceFormation),
Constraint fk_Neighborhood Foreign key (fkNeighborhood) references NeighBorhood(IdNeighborhood),
Constraint fk_Locality4 Foreign key (fkLocality) references Locality(IdLocality)
);

Insert into Institute Values("","Celestin","Suba-Toscana","cra 1","ccf@hotmail.com",3,1,1,3);

Insert into Institute Values("","LLeras","Suba-Villamaria","Cra2","lleras@hotmail.com",5,2,2,19);

Insert into Institute Values("","Gerardo Paredes","Suba-Gaitana","Cra3","gp@hotmail.com",4,3,3,12);

Insert into Institute Values("","Fe y Alegria","Suba-Toscana","Cra4","fa@hotmail.com",1,4,4,7);

Insert into Institute Values("","Gerardo Molina","","Cra5","gm@hotmail.com",2,5,5,4);

Insert into Institute Values("","Tibabuyes","Suba-Tibabuyes","Cra6","tb@hotmail.com",6,6,6,9);

Insert into Institute Values("","Dulce Maria","Suba-Compartir","Cra7","dm@hotmail.com",7,7,7,8);

Insert into Institute Values("","Siglo 21","Suba-Aures","Cra8","s21@hotmail.com",8,8,8,13);

Insert into Institute Values("","Julio Flores","Floresta","Cra9","jf@hotmail.com",9,9,9,15);

Insert into Institute Values("","21 Angeles","21 Angeles","Cra10","21a@hotmail.com",10,10,10,10);

create table Programming(
IdProgramming bigint primary key auto_increment not null,
HoursToWork bigint not null,
fkActivityType bigint not null,
DaysToWork varchar(60) not null,
fkWorkingDay bigint not null,
fkPersonInstructor bigint not null,
fkGroup bigint not null,
fkInstitute bigint not null,
Constraint fk_ActivityType Foreign key (fkActivityType) references ActivityType(IdActivityType),
Constraint fk_WorkingDay Foreign key (fkWorkingDay) references WorkingDay(IdWorkingDay),
Constraint fk_IdPersonInstructor Foreign key (fkPersonInstructor) references Person(IdPerson),
Constraint fk_IdGroup1 Foreign key (fkGroup) references Groupp(IdGroup),
Constraint fkInstitute Foreign key (fkInstitute) references Institute(IdInstitute)
);

insert into Programming values ("",5,1,"Lunes,Jueves",1,1007249256,1356743,1);
