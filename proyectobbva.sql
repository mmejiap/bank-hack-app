create database registrobbva1;

create table usuario(
	dni char(8) not null primary key,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    dirección varchar(50),
    email varchar(50) not null,
    pass varchar(50) not null
);



create table tarjeta(
	ntarjeta char(16) not null primary key,
    tipotarjeta char(1) not null,
    fechavencimiento datetime not null,
    cvv int(3) not null,
    ncuenta char(18) not null,
    montototal float not null,    
    saldo float not null,
    fdni char(8) not null
);

create table deudas(
	iddeuda char(10) not null primary key,
	fdni char(8) not null,
    fidservicio char(10) not null,
    montodeuda float not null,
    fechavencimiento datetime not null
);


create table servicios(
	idservicio char(10) not null primary key,
    nombreservicio varchar(40) not null
);

create table pago(
	idpago int auto_increment primary key,
	fntarjeta char(16) not null,
    fiddeuda char(10) not null,
    fechapago datetime
);



#foring key usuario-tarjeta
alter table tarjeta add constraint fk_usuariotarjeta foreign key (fdni) references usuario(dni);

#foreign key 1usuario-ndeudas
alter table deudas add constraint fk_usuariodeuda foreign key (fdni) references usuario(dni);

#foreign key 1 deuda-1 pago
alter table pago add constraint fk_deudapago foreign key (fiddeuda) references deudas(iddeuda);

#foreign key 1 tarjeta-N pago
alter table pago add constraint fk_tarjetapago foreign key (fntarjeta) references tarjeta(ntarjeta);

#foreign key 1 servicio -N deuda
alter table deudas add constraint fk_serviciodeuda foreign key (fidservicio) references servicios(idservicio);


#Insert usuuario
insert into usuario values('40955780','Frasquito','Robertazzi','2002 Debra Road','frobertazzi0@prweb.com','5780frob');
insert into usuario values('91643368','Sonja','Dryden','94142 Doe Crossing Road','sdryden1@hubpages.com','3368sdry');
insert into usuario values('71067500','Kristyn','Lowrie','48506 Nancy Trail','klowrie2@ucoz.com','7500klow');
insert into usuario values('54709494','Abram','Mazin','073 High Crossing Avenue','amazin3@marriott.com','9494amaz');
insert into usuario values('74540394','Thebault','Woodfine','8 Weeping Birch Alley','twoodfine4@sciencedaily.com','0394twoo');
insert into usuario values('27721511','Katharine','Limbourne','50141 John Wall Drive','klimbourne5@ameblo.jp','1511klim');
insert into usuario values('65882372','Marybelle','Avo','266 Lillian Way','mavo6@reuters.com','2372mavo');
insert into usuario values('11432883','Zelig','Escritt','91176 Bartillon Road','zescritt7@google.nl','2883zesc');
insert into usuario values('43894744','Hadley','Georgeou','846 Susan Pass','hgeorgeou8@squidoo.com','4744hgeo');
insert into usuario values('45743040','Mab','Jannasch','004 Columbus Center','mjannasch9@nasa.gov','3040mjan');
insert into usuario values('77571723','Farr','Carmody','4143 Arizona Way','fcarmodya@bravesites.com','1723fcar');
insert into usuario values('75847753','Lowell','McRory','33 Lotheville Way','lmcroryb@google.it','7753lmcr');
insert into usuario values('79289752','Marge','Dismore','95 Rockefeller Court','mdismorec@i2i.jp','9752mdis');
insert into usuario values('51159676','Emilia','Frantzen','3 Graedel Road','efrantzend@studiopress.com','9676efra');

#Insert servicios
insert into servicios values('88548987','Internet');
insert into servicios values('8256668','Internet');
insert into servicios values('46772786','Internet');
insert into servicios values('62725342','Luz');

select * from deudas;
#Insert deudas
insert into deudas values('99887701','40955780','88548987',3579,'2019-10-25');
insert into deudas values('99887702','91643368','8256668',4551,'2020-12-19');
insert into deudas values('99887704','54709494','62725342',2090,'2019-04-29');
insert into deudas values('99887705','74540394','88548987',6608,'2020-12-04');
insert into deudas values('99887706','27721511','8256668',5871,'2020-07-25');
insert into deudas values('99887707','65882372','46772786',5941,'2019-04-26');
insert into deudas values('99887708','11432883','62725342',2506,'2019-10-21');
insert into deudas values('99887709','43894744','88548987',2805,'2019-04-17');
insert into deudas values('99887710','45743040','8256668',6490,'2020-02-16');
insert into deudas values('99887711','77571723','46772786',3266,'2019-05-04');
insert into deudas values('99887712','75847753','62725342',4999,'2019-04-29');
insert into deudas values('99887713','79289752','88548987',1579,'2020-12-04');
insert into deudas values('99887714','51159676','8256668',7591,'2020-10-02');
insert into deudas values('99887715','40955780','46772786',3797,'2019-03-12');
insert into deudas values('99887716','91643368','62725342',2748,'2019-09-18');
insert into deudas values('99887718','54709494','8256668',4165,'2019-02-21');
insert into deudas values('99887719','74540394','46772786',5068,'2019-11-16');
insert into deudas values('99887720','27721511','62725342',7552,'2019-12-04');
insert into deudas values('99887721','65882372','88548987',2925,'2020-12-17');
insert into deudas values('99887722','11432883','8256668',6846,'2019-08-20');
insert into deudas values('99887723','43894744','46772786',6889,'2020-08-24');
insert into deudas values('99887724','45743040','62725342',3182,'2020-07-19');
insert into deudas values('99887725','77571723','88548987',1631,'2020-10-02');
insert into deudas values('99887726','75847753','8256668',5476,'2020-06-03');
insert into deudas values('99887727','79289752','46772786',2341,'2020-04-10');
insert into deudas values('99887728','51159676','62725342',1840,'2019-05-13');
insert into deudas values('99887729','40955780','88548987',7128,'2019-11-04');
insert into deudas values('99887730','91643368','8256668',5681,'2020-10-02');
insert into deudas values('99887732','54709494','62725342',2225,'2020-04-10');
insert into deudas values('99887733','74540394','88548987',1868,'2019-05-13');
insert into deudas values('99887734','27721511','8256668',4515,'2019-11-04');
insert into deudas values('99887735','65882372','46772786',7628,'2019-05-13');
insert into deudas values('99887736','11432883','62725342',4695,'2019-11-04');
insert into deudas values('99887737','43894744','88548987',7983,'2020-12-04');
insert into deudas values('99887738','45743040','8256668',1877,'2020-07-25');
insert into deudas values('99887739','77571723','46772786',1805,'2019-04-26');

#Insert Tarjeta
insert into tarjeta values('9455410351913420','D','2022-06-24','278','99075977837483900',58070.37,58070.37,'40955780');
insert into tarjeta values('6557982747680070','D','2023-07-04','656','97057187904367000',74547.41,745,'54709494');
insert into tarjeta values('8277426390593260','D','2019-10-24','126','10007951639939100',70818.58,70818.58,'65882372');
insert into tarjeta values('3165238492425950','C','2022-04-21','168','71087354658985900',31970.09,26011.09,'11432883');
insert into tarjeta values('8950898508195120','C','2020-08-05','569','9037530871388520',6334.96,375.96,'43894744');
insert into tarjeta values('3362967080679010','D','2023-06-03','854','30063708704334200',20414.26,20414.26,'45743040');
insert into tarjeta values('1388205353989620','D','2020-08-28','332','11093366296653900',23107.76,123,'77571723');
insert into tarjeta values('6733629212707340','C','2020-04-25','112','50010782461302100',92544.91,86585.91,'75847753');
insert into tarjeta values('9326132176847060','D','2021-10-25','401','72088706571553700',34444.32,34444.32,'79289752');
insert into tarjeta values('5330568867863390','D','2022-12-19','376','15016351023626700',87983.28,8796,'51159676');
insert into tarjeta values('6884568426236890','C','2021-08-19','959','2010652062115120',96973.62,91014.62,'40955780');
insert into tarjeta values('9353237873634060','D','2021-04-29','424','36058887060185900',67109.49,645,'91643368');
insert into tarjeta values('6094993210012930','D','2022-12-04','404','73026447001529000',32743.35,32743.35,'54709494');
insert into tarjeta values('4423324223042710','C','2022-10-02','691','78048859566320800',12328.99,20,'74540394');
insert into tarjeta values('8340958936101020','D','2023-03-12','563','15071800558688300',46925.58,46925.58,'27721511');
insert into tarjeta values('1644615281596100','D','2019-09-18','994','27007600959752300',20143.06,1332,'65882372');
insert into tarjeta values('9784764762802860','D','2021-05-15','914','54067665700993500',72738.27,72738.27,'11432883');
insert into tarjeta values('9256266341536440','D','2021-02-21','437','20013402270382300',8404.68,8404.68,'43894744');
insert into tarjeta values('3144199580598770','C','2019-11-16','366','95021811113118000',21363.93,15404.93,'45743040');
insert into tarjeta values('9779403936151790','D','2021-12-04','178','86070119620850600',69946.15,69946.15,'40955780');
insert into tarjeta values('7784788913584750','D','2022-12-17','223','74049984542733200',87099.44,8770,'91643368');
insert into tarjeta values('8060634348816350','D','2021-08-20','140','72095965201439900',63983.97,63983.97,'54709494');
insert into tarjeta values('1977034566014570','C','2022-08-24','741','75006918386135500',16285.6,10326.6,'74540394');
insert into tarjeta values('9745237351952500','D','2020-07-19','231','9099642999033600',8867.16,8867.16,'65882372');
insert into tarjeta values('8200895603873080','D','2020-07-25','864','90086153731765100',64479.2,64479.2,'11432883');
insert into tarjeta values('7973456802755930','D','2023-04-26','971','49063093305511000',56374.18,56374.18,'43894744');
insert into tarjeta values('2989537968233100','C','2021-10-21','551','55010312791764100',2209.83,379,'77571723');
insert into tarjeta values('7876023105292800','D','2023-04-17','671','22068820353959800',94074.2,94074.2,'75847753');
insert into tarjeta values('6536639731837430','C','2020-02-16','992','18028334745014500',40781.01,1566,'79289752');
insert into tarjeta values('9105879643587360','D','2021-05-04','858','22037729172259000',98291,98291,'51159676');
insert into tarjeta values('6467855969033240','D','2019-11-25','171','72001415294517600',90669.33,90669.33,'75847753');
insert into tarjeta values('1507103887204940','D','2020-10-02','975','66049423203446400',45354.2,45354.2,'91643368');
insert into tarjeta values('2481024547984210','D','2022-06-03','450','74032011415818300',39834.24,39834.24,'54709494');
insert into tarjeta values('6253713825120900','D','2020-04-10','589','39080350477263100',75988.91,75988.91,'74540394');
insert into tarjeta values('9633460092642000','C','2023-05-13','327','82038814682961200',75808.86,698,'27721511');
insert into tarjeta values('8240725990800050','D','2019-11-04','858','69069935786929200',27906.09,27906.09,'65882372');

#Insert Pago
insert into pago values ('0','3165238492425950','99887708','2019-07-19');

select t.fdni,d.iddeuda,t.ntarjeta from tarjeta t, deudas d
where t.fdni  = d.fdni;

#Procedimientos Almacenados

select * from deudas;