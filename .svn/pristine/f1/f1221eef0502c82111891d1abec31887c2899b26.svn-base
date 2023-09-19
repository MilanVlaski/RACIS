/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2016                    */
/* Created on:     6/8/2023 8:12:53 PM                          */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Adresni podaci"') and o.name = 'FK_ADRESNI _KOD DRUGO_POSLOVNI')
alter table "Adresni podaci"
   drop constraint "FK_ADRESNI _KOD DRUGO_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Adresni podaci"') and o.name = 'FK_ADRESNI _KONTAKT P_REGISTAR')
alter table "Adresni podaci"
   drop constraint "FK_ADRESNI _KONTAKT P_REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Adresni podaci"') and o.name = 'FK_ADRESNI _MJESTO AD_NASELJEN')
alter table "Adresni podaci"
   drop constraint "FK_ADRESNI _MJESTO AD_NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Atribut') and o.name = 'FK_ATRIBUT_RESURSI P_POSLOVNI')
alter table Atribut
   drop constraint "FK_ATRIBUT_RESURSI P_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Drava') and o.name = 'FK_DRAVA_AKTUELNI _NASELJEN')
alter table Drava
   drop constraint "FK_DRAVA_AKTUELNI _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Drava') and o.name = 'FK_DRAVA_TEKUCE UR_DRAVNO')
alter table Drava
   drop constraint "FK_DRAVA_TEKUCE UR_DRAVNO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Dravljanstvo') and o.name = 'FK_DRAVLJA_DRAVLJAN_REGISTAR')
alter table Dravljanstvo
   drop constraint FK_DRAVLJA_DRAVLJAN_REGISTAR
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Dravljanstvo') and o.name = 'FK_DRAVLJA_DRAVLJAN_DRAVA')
alter table Dravljanstvo
   drop constraint FK_DRAVLJA_DRAVLJAN_DRAVA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Glavni grad"') and o.name = 'FK_GLAVNI G_GLAVNI GR_DRAVA')
alter table "Glavni grad"
   drop constraint "FK_GLAVNI G_GLAVNI GR_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Glavni grad"') and o.name = 'FK_GLAVNI G_GLAVNI GR_NASELJEN')
alter table "Glavni grad"
   drop constraint "FK_GLAVNI G_GLAVNI GR_NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Inventar') and o.name = 'FK_INVENTAR_PRIPADA3_POSLOVNI')
alter table Inventar
   drop constraint FK_INVENTAR_PRIPADA3_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Inventar') and o.name = 'FK_INVENTAR_TIPIZACIJ_TIP')
alter table Inventar
   drop constraint FK_INVENTAR_TIPIZACIJ_TIP
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija uredenja"') and o.name = 'FK_ISTORIJA_KROZ ISTO_DRAVA')
alter table "Istorija uredenja"
   drop constraint "FK_ISTORIJA_KROZ ISTO_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija uredenja"') and o.name = 'FK_ISTORIJA_UREĞENJE _DRAVNO')
alter table "Istorija uredenja"
   drop constraint "FK_ISTORIJA_UREĞENJE _DRAVNO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Izabrani tipovi organizacione jedinice"') and o.name = 'FK_IZABRANI_IZABRANA _TIP ORGA')
alter table "Izabrani tipovi organizacione jedinice"
   drop constraint "FK_IZABRANI_IZABRANA _TIP ORGA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Izabrani tipovi organizacione jedinice"') and o.name = 'FK_IZABRANI_IZBOR TIP_POSLOVNI')
alter table "Izabrani tipovi organizacione jedinice"
   drop constraint "FK_IZABRANI_IZBOR TIP_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Iznajmljena vozila"') and o.name = 'FK_IZNAJMLJ_JE IZNAJM_VOZILO')
alter table "Iznajmljena vozila"
   drop constraint "FK_IZNAJMLJ_JE IZNAJM_VOZILO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Iznajmljena vozila"') and o.name = 'FK_IZNAJMLJ_JE REZERV_REZERVAC')
alter table "Iznajmljena vozila"
   drop constraint "FK_IZNAJMLJ_JE REZERV_REZERVAC"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Iznajmljena vozila"') and o.name = 'FK_IZNAJMLJ_PREDAO VO_REGISTAR')
alter table "Iznajmljena vozila"
   drop constraint "FK_IZNAJMLJ_PREDAO VO_REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Iznajmljena vozila"') and o.name = 'FK_IZNAJMLJ_PREUZIMA _KLIJENT')
alter table "Iznajmljena vozila"
   drop constraint "FK_IZNAJMLJ_PREUZIMA _KLIJENT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Iznajmljena vozila"') and o.name = 'FK_IZNAJMLJ_PRIJEM VO_REGISTAR')
alter table "Iznajmljena vozila"
   drop constraint "FK_IZNAJMLJ_PRIJEM VO_REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Iznajmljena vozila"') and o.name = 'FK_IZNAJMLJ_VRACA IZN_KLIJENT')
alter table "Iznajmljena vozila"
   drop constraint "FK_IZNAJMLJ_VRACA IZN_KLIJENT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Katalog radnih mjesta"') and o.name = 'FK_KATALOG _IMA RADNA_POSLOVNI')
alter table "Katalog radnih mjesta"
   drop constraint "FK_KATALOG _IMA RADNA_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Katalog zanimanja"') and o.name = 'FK_KATALOG _REGISTROV_DRAVA')
alter table "Katalog zanimanja"
   drop constraint "FK_KATALOG _REGISTROV_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Katalog zvanja"') and o.name = 'FK_KATALOG _KATALOG Z_DRAVA')
alter table "Katalog zvanja"
   drop constraint "FK_KATALOG _KATALOG Z_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Klijent') and o.name = 'FK_KLIJENT_VRSTA LIC_TIP KLIJ')
alter table Klijent
   drop constraint "FK_KLIJENT_VRSTA LIC_TIP KLIJ"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Korisnicki nalog"') and o.name = 'FK_KORISNIC_NALOG ZAP_REGISTAR')
alter table "Korisnicki nalog"
   drop constraint "FK_KORISNIC_NALOG ZAP_REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Korisnicki nalog"') and o.name = 'FK_KORISNIC_REGISTROV_POSLOVNI')
alter table "Korisnicki nalog"
   drop constraint FK_KORISNIC_REGISTROV_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Lista zvanja"') and o.name = 'FK_LISTA ZV_LISTA ZVA_KATALOG')
alter table "Lista zvanja"
   drop constraint "FK_LISTA ZV_LISTA ZVA_KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Lista zvanja"') and o.name = 'FK_LISTA ZV_OBUHVATA _ŠKOLSKA')
alter table "Lista zvanja"
   drop constraint "FK_LISTA ZV_OBUHVATA _ŠKOLSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Mjesna zajednica"') and o.name = 'FK_MJESNA Z_IMA MJESN_OPŠTINA')
alter table "Mjesna zajednica"
   drop constraint "FK_MJESNA Z_IMA MJESN_OPŠTINA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Mjesna zajednica"') and o.name = 'FK_MJESNA Z_SJEDIŠTE _NASELJEN')
alter table "Mjesna zajednica"
   drop constraint "FK_MJESNA Z_SJEDIŠTE _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Mjesno pokrivanje naselja"') and o.name = 'FK_MJESNO P_MJESNA ZA_MJESNA Z')
alter table "Mjesno pokrivanje naselja"
   drop constraint "FK_MJESNO P_MJESNA ZA_MJESNA Z"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Mjesno pokrivanje naselja"') and o.name = 'FK_MJESNO P_PRIPADA M_NASELJEN')
alter table "Mjesno pokrivanje naselja"
   drop constraint "FK_MJESNO P_PRIPADA M_NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Naseljeno mjesto"') and o.name = 'FK_NASELJEN_SADRI NA_DRAVA')
alter table "Naseljeno mjesto"
   drop constraint "FK_NASELJEN_SADRI NA_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obrazuju za"') and o.name = 'FK_OBRAZUJU_OBRAZUJU _POSLOVNI')
alter table "Obrazuju za"
   drop constraint "FK_OBRAZUJU_OBRAZUJU _POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obrazuju za"') and o.name = 'FK_OBRAZUJU_ŠKOLSKE S_ŠKOLSKA')
alter table "Obrazuju za"
   drop constraint "FK_OBRAZUJU_ŠKOLSKE S_ŠKOLSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obuhvata naselja"') and o.name = 'FK_OBUHVATA_OBUHVATA _REGION')
alter table "Obuhvata naselja"
   drop constraint "FK_OBUHVATA_OBUHVATA _REGION"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obuhvata naselja"') and o.name = 'FK_OBUHVATA_PRIPADA R_NASELJEN')
alter table "Obuhvata naselja"
   drop constraint "FK_OBUHVATA_PRIPADA R_NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obuhvata opštine"') and o.name = 'FK_OBUHVATA_OPŠTINA O_OPŠTINA')
alter table "Obuhvata opštine"
   drop constraint "FK_OBUHVATA_OPŠTINA O_OPŠTINA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Obuhvata opštine"') and o.name = 'FK_OBUHVATA_OBUHVATA _NASELJEN2')
alter table "Obuhvata opštine"
   drop constraint "FK_OBUHVATA_OBUHVATA _NASELJEN2"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Odrzavanje') and o.name = 'FK_ODRZAVAN_ODRZAVA_POSLOVNI')
alter table Odrzavanje
   drop constraint FK_ODRZAVAN_ODRZAVA_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Odrzavanje') and o.name = 'FK_ODRZAVAN_SE ODRZAV_VOZILO')
alter table Odrzavanje
   drop constraint "FK_ODRZAVAN_SE ODRZAV_VOZILO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Odsjek') and o.name = 'FK_ODSJEK_TIPIZACIJ_TIP SEKT')
alter table Odsjek
   drop constraint "FK_ODSJEK_TIPIZACIJ_TIP SEKT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Opština') and o.name = 'FK_OPŠTINA_LOKALNA S_DRAVA')
alter table Opština
   drop constraint "FK_OPŠTINA_LOKALNA S_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Opština') and o.name = 'FK_OPŠTINA_SJEDIŠTE _NASELJEN')
alter table Opština
   drop constraint "FK_OPŠTINA_SJEDIŠTE _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Organizacija trajnih resursa"') and o.name = 'FK_ORGANIZA_PRIPADNOS_ORGANIZA')
alter table "Organizacija trajnih resursa"
   drop constraint FK_ORGANIZA_PRIPADNOS_ORGANIZA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Organizacija trajnih resursa"') and o.name = 'FK_ORGANIZA_RESURS DO_TRAJNI M')
alter table "Organizacija trajnih resursa"
   drop constraint "FK_ORGANIZA_RESURS DO_TRAJNI M"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Organizaciona jedinica"') and o.name = 'FK_ORGANIZA_SJEDIŠTE _NASELJEN')
alter table "Organizaciona jedinica"
   drop constraint "FK_ORGANIZA_SJEDIŠTE _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Organizaciona jedinica"') and o.name = 'FK_ORGANIZA_TIPIZACIJ_IZABRANI')
alter table "Organizaciona jedinica"
   drop constraint FK_ORGANIZA_TIPIZACIJ_IZABRANI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Organizaciona jedinica"') and o.name = 'FK_ORGANIZA_UNUTRAŠNJ_POSLOVNI')
alter table "Organizaciona jedinica"
   drop constraint FK_ORGANIZA_UNUTRAŠNJ_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Organizaciona sema"') and o.name = 'FK_ORGANIZA_IMA_POSLOVNI')
alter table "Organizaciona sema"
   drop constraint FK_ORGANIZA_IMA_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ostali materijalni resursi"') and o.name = 'FK_OSTALI M_RELATIONS_TRAJNI M')
alter table "Ostali materijalni resursi"
   drop constraint "FK_OSTALI M_RELATIONS_TRAJNI M"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Personalna restrikcija"') and o.name = 'FK_PERSONAL_PERSONALN_PRIPADA')
alter table "Personalna restrikcija"
   drop constraint FK_PERSONAL_PERSONALN_PRIPADA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Personalna restrikcija"') and o.name = 'FK_PERSONAL_PERSONALN_ATRIBUT')
alter table "Personalna restrikcija"
   drop constraint FK_PERSONAL_PERSONALN_ATRIBUT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Personalna restrikcija"') and o.name = 'FK_PERSONAL_PERSONALN_TABELA')
alter table "Personalna restrikcija"
   drop constraint FK_PERSONAL_PERSONALN_TABELA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Plovno vozilo"') and o.name = 'FK_PLOVNO V_MOZE BITI_VOZILO')
alter table "Plovno vozilo"
   drop constraint "FK_PLOVNO V_MOZE BITI_VOZILO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Plovno vozilo"') and o.name = 'FK_PLOVNO V_VRSTA BRO_TIP PLOV')
alter table "Plovno vozilo"
   drop constraint "FK_PLOVNO V_VRSTA BRO_TIP PLOV"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Plovno vozilo"') and o.name = 'FK_PLOVNO V_VRSTA POG_POGON')
alter table "Plovno vozilo"
   drop constraint "FK_PLOVNO V_VRSTA POG_POGON"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Podaci o obrazovanju"') and o.name = 'FK_PODACI O_OBRAZOVNA_POSLOVNI')
alter table "Podaci o obrazovanju"
   drop constraint "FK_PODACI O_OBRAZOVNA_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Podaci o obrazovanju"') and o.name = 'FK_PODACI O_PODACI O _REGISTAR')
alter table "Podaci o obrazovanju"
   drop constraint "FK_PODACI O_PODACI O _REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Podaci o obrazovanju"') and o.name = 'FK_PODACI O_TIPIZACIJ_KATALOG')
alter table "Podaci o obrazovanju"
   drop constraint "FK_PODACI O_TIPIZACIJ_KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Podaci o obrazovanju"') and o.name = 'FK_PODACI O_TIPIZACIJ_ŠKOLSKA')
alter table "Podaci o obrazovanju"
   drop constraint "FK_PODACI O_TIPIZACIJ_ŠKOLSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovna hijerarhija"') and o.name = 'FK_POSLOVNA_HIJERARHI_ORGANIZA')
alter table "Poslovna hijerarhija"
   drop constraint FK_POSLOVNA_HIJERARHI_ORGANIZA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovna hijerarhija"') and o.name = 'FK_POSLOVNA_NADREDJEN_ODSJEK')
alter table "Poslovna hijerarhija"
   drop constraint FK_POSLOVNA_NADREDJEN_ODSJEK
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovna hijerarhija"') and o.name = 'FK_POSLOVNA_NADREDJEN_KATALOG')
alter table "Poslovna hijerarhija"
   drop constraint FK_POSLOVNA_NADREDJEN_KATALOG
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovna hijerarhija"') and o.name = 'FK_POSLOVNA_PODREDJEN_ODSJEK')
alter table "Poslovna hijerarhija"
   drop constraint FK_POSLOVNA_PODREDJEN_ODSJEK
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovna hijerarhija"') and o.name = 'FK_POSLOVNA_PODREDJEN_KATALOG')
alter table "Poslovna hijerarhija"
   drop constraint FK_POSLOVNA_PODREDJEN_KATALOG
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovna hijerarhija"') and o.name = 'FK_POSLOVNA_U SKLOPU _ORGANIZA')
alter table "Poslovna hijerarhija"
   drop constraint "FK_POSLOVNA_U SKLOPU _ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovni sistem"') and o.name = 'FK_POSLOVNI_DRAVA PO_DRAVA')
alter table "Poslovni sistem"
   drop constraint "FK_POSLOVNI_DRAVA PO_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovni sistem"') and o.name = 'FK_POSLOVNI_PRAVNI SL_POSLOVNI')
alter table "Poslovni sistem"
   drop constraint "FK_POSLOVNI_PRAVNI SL_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovni sistem"') and o.name = 'FK_POSLOVNI_PRIPADA2_TRAJNI M')
alter table "Poslovni sistem"
   drop constraint "FK_POSLOVNI_PRIPADA2_TRAJNI M"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovni sistem"') and o.name = 'FK_POSLOVNI_SJEDIŠTE _NASELJEN')
alter table "Poslovni sistem"
   drop constraint "FK_POSLOVNI_SJEDIŠTE _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Poslovni sistem"') and o.name = 'FK_POSLOVNI_TIPIZACIJ_TIP POSL')
alter table "Poslovni sistem"
   drop constraint "FK_POSLOVNI_TIPIZACIJ_TIP POSL"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Potrebna školska sprema"') and o.name = 'FK_POTREBNA_POTREBNA _ŠKOLSKA')
alter table "Potrebna školska sprema"
   drop constraint "FK_POTREBNA_POTREBNA _ŠKOLSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Potrebna školska sprema"') and o.name = 'FK_POTREBNA_ŠKOLSKA S_KATALOG')
alter table "Potrebna školska sprema"
   drop constraint "FK_POTREBNA_ŠKOLSKA S_KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Potrebne spreme"') and o.name = 'FK_POTREBNE_POTREBNE _ŠKOLSKA')
alter table "Potrebne spreme"
   drop constraint "FK_POTREBNE_POTREBNE _ŠKOLSKA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Potrebne spreme"') and o.name = 'FK_POTREBNE_POTREBNE _KATALOG')
alter table "Potrebne spreme"
   drop constraint "FK_POTREBNE_POTREBNE _KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Povezana sa"') and o.name = 'FK_POVEZANA_POVEZANA _TABELA')
alter table "Povezana sa"
   drop constraint "FK_POVEZANA_POVEZANA _TABELA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Povezana sa"') and o.name = 'FK_POVEZANA_TABELA_TABELA')
alter table "Povezana sa"
   drop constraint FK_POVEZANA_TABELA_TABELA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pozicija u organizacionoj jedinici"') and o.name = 'FK_POZICIJA_NA POZICI_KATALOG')
alter table "Pozicija u organizacionoj jedinici"
   drop constraint "FK_POZICIJA_NA POZICI_KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pozicija u organizacionoj jedinici"') and o.name = 'FK_POZICIJA_ZAPOSLEN _ORGANIZA')
alter table "Pozicija u organizacionoj jedinici"
   drop constraint "FK_POZICIJA_ZAPOSLEN _ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pravni nasljednik"') and o.name = 'FK_PRAVNI N_DRAVA PR_DRAVA')
alter table "Pravni nasljednik"
   drop constraint "FK_PRAVNI N_DRAVA PR_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pravni nasljednik"') and o.name = 'FK_PRAVNI N_NASLJEĞEN_DRAVA')
alter table "Pravni nasljednik"
   drop constraint "FK_PRAVNI N_NASLJEĞEN_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pravo na podsistem"') and o.name = 'FK_PRAVO NA_ROLA OBUH_ROLA')
alter table "Pravo na podsistem"
   drop constraint "FK_PRAVO NA_ROLA OBUH_ROLA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pravo na podsistem"') and o.name = 'FK_PRAVO NA_SISTEM PR_SISTEM I')
alter table "Pravo na podsistem"
   drop constraint "FK_PRAVO NA_SISTEM PR_SISTEM I"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Predefinisane role radnih mjesta"') and o.name = 'FK_PREDEFIN_PREDEFINI_KATALOG')
alter table "Predefinisane role radnih mjesta"
   drop constraint FK_PREDEFIN_PREDEFINI_KATALOG
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Predefinisane role radnih mjesta"') and o.name = 'FK_PREDEFIN_ROLE ZA R_ROLA')
alter table "Predefinisane role radnih mjesta"
   drop constraint "FK_PREDEFIN_ROLE ZA R_ROLA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Prikolica') and o.name = 'FK_PRIKOLIC_MOZE BITI_VOZILO')
alter table Prikolica
   drop constraint "FK_PRIKOLIC_MOZE BITI_VOZILO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Prikolica') and o.name = 'FK_PRIKOLIC_TIPIZACIJ_TIP PRIK')
alter table Prikolica
   drop constraint "FK_PRIKOLIC_TIPIZACIJ_TIP PRIK"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pripada roli"') and o.name = 'FK_PRIPADA _KO JE U G_ROLA')
alter table "Pripada roli"
   drop constraint "FK_PRIPADA _KO JE U G_ROLA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pripada roli"') and o.name = 'FK_PRIPADA _SVRSTAN U_KORISNIC')
alter table "Pripada roli"
   drop constraint "FK_PRIPADA _SVRSTAN U_KORISNIC"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pripadnost odsjeku"') and o.name = 'FK_PRIPADNO_POZICIJA_ODSJEK')
alter table "Pripadnost odsjeku"
   drop constraint FK_PRIPADNO_POZICIJA_ODSJEK
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pripadnost odsjeku"') and o.name = 'FK_PRIPADNO_PRIPADA_KATALOG')
alter table "Pripadnost odsjeku"
   drop constraint FK_PRIPADNO_PRIPADA_KATALOG
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pripadnost poslovnici"') and o.name = 'FK_PRIPADNO_POSLOVNIC_ORGANIZA')
alter table "Pripadnost poslovnici"
   drop constraint FK_PRIPADNO_POSLOVNIC_ORGANIZA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pripadnost poslovnici"') and o.name = 'FK_PRIPADNO_VOZILO_VOZILO')
alter table "Pripadnost poslovnici"
   drop constraint FK_PRIPADNO_VOZILO_VOZILO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Raspored na radna mjesta"') and o.name = 'FK_RASPORED_KADROVI U_ORGANIZA')
alter table "Raspored na radna mjesta"
   drop constraint "FK_RASPORED_KADROVI U_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Raspored na radna mjesta"') and o.name = 'FK_RASPORED_RASPORED _KATALOG')
alter table "Raspored na radna mjesta"
   drop constraint "FK_RASPORED_RASPORED _KATALOG"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Raspored na radna mjesta"') and o.name = 'FK_RASPORED_RASPORED _REGISTAR')
alter table "Raspored na radna mjesta"
   drop constraint "FK_RASPORED_RASPORED _REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Raspored na radna mjesta"') and o.name = 'FK_RASPORED_TIPIZACIJ_VRSTA RA')
alter table "Raspored na radna mjesta"
   drop constraint "FK_RASPORED_TIPIZACIJ_VRSTA RA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Razmjena') and o.name = 'FK_RAZMJENA_STATUS_STATUS R')
alter table Razmjena
   drop constraint "FK_RAZMJENA_STATUS_STATUS R"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Razmjena') and o.name = 'FK_RAZMJENA_ZAKAZIVAN_IZNAJMLJ')
alter table Razmjena
   drop constraint FK_RAZMJENA_ZAKAZIVAN_IZNAJMLJ
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Region') and o.name = 'FK_REGION_ADMINISTR_NASELJEN')
alter table Region
   drop constraint FK_REGION_ADMINISTR_NASELJEN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Region') and o.name = 'FK_REGION_MATICNA D_DRAVA')
alter table Region
   drop constraint "FK_REGION_MATICNA D_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Region') and o.name = 'FK_REGION_TIPIZACIJ_TIP REGI')
alter table Region
   drop constraint "FK_REGION_TIPIZACIJ_TIP REGI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Registar zaposlenih"') and o.name = 'FK_REGISTAR_ZAPOŠLJAV_POSLOVNI')
alter table "Registar zaposlenih"
   drop constraint FK_REGISTAR_ZAPOŠLJAV_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Restrikcija atributa"') and o.name = 'FK_RESTRIKC_ATRIBUTI _ATRIBUT')
alter table "Restrikcija atributa"
   drop constraint "FK_RESTRIKC_ATRIBUTI _ATRIBUT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Restrikcija atributa"') and o.name = 'FK_RESTRIKC_ROLA OBUH_ROLA2')
alter table "Restrikcija atributa"
   drop constraint "FK_RESTRIKC_ROLA OBUH_ROLA2"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Restrikcija nad tabelama"') and o.name = 'FK_RESTRIKC_ROLA OBUH_ROLA')
alter table "Restrikcija nad tabelama"
   drop constraint "FK_RESTRIKC_ROLA OBUH_ROLA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Restrikcija nad tabelama"') and o.name = 'FK_RESTRIKC_TABELE PR_TABELA')
alter table "Restrikcija nad tabelama"
   drop constraint "FK_RESTRIKC_TABELE PR_TABELA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Rezervacija') and o.name = 'FK_REZERVAC_REZERVISE_KLIJENT')
alter table Rezervacija
   drop constraint FK_REZERVAC_REZERVISE_KLIJENT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Rezervacija') and o.name = 'FK_REZERVAC_STANJE_STATUS R')
alter table Rezervacija
   drop constraint "FK_REZERVAC_STANJE_STATUS R"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Rola') and o.name = 'FK_ROLA_ROLE POSL_POSLOVNI')
alter table Rola
   drop constraint "FK_ROLA_ROLE POSL_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri atribute"') and o.name = 'FK_SADRI A_PRIPADAJU_ATRIBUT')
alter table "Sadri atribute"
   drop constraint "FK_SADRI A_PRIPADAJU_ATRIBUT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri atribute"') and o.name = 'FK_SADRI A_SADRI AT_TABELA')
alter table "Sadri atribute"
   drop constraint "FK_SADRI A_SADRI AT_TABELA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri podsisteme"') and o.name = 'FK_SADRI P_PODSISTEM_SISTEM I')
alter table "Sadri podsisteme"
   drop constraint "FK_SADRI P_PODSISTEM_SISTEM I"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri podsisteme"') and o.name = 'FK_SADRI P_SISTEM_SISTEM I')
alter table "Sadri podsisteme"
   drop constraint "FK_SADRI P_SISTEM_SISTEM I"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri tabele"') and o.name = 'FK_SADRI T_PRIPADAJU_TABELA')
alter table "Sadri tabele"
   drop constraint "FK_SADRI T_PRIPADAJU_TABELA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sadri tabele"') and o.name = 'FK_SADRI T_SADRI TA_SISTEM I')
alter table "Sadri tabele"
   drop constraint "FK_SADRI T_SADRI TA_SISTEM I"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sastav drava"') and o.name = 'FK_SASTAV D_DRAVA CL_DRAVA')
alter table "Sastav drava"
   drop constraint "FK_SASTAV D_DRAVA CL_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sastav drava"') and o.name = 'FK_SASTAV D_SLOENA D_DRAVA')
alter table "Sastav drava"
   drop constraint "FK_SASTAV D_SLOENA D_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sastav regiona"') and o.name = 'FK_SASTAV R_REGION U _REGION')
alter table "Sastav regiona"
   drop constraint "FK_SASTAV R_REGION U _REGION"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sastav regiona"') and o.name = 'FK_SASTAV R_SASTAVLJE_REGION')
alter table "Sastav regiona"
   drop constraint "FK_SASTAV R_SASTAVLJE_REGION"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Se nalazi"') and o.name = 'FK_SE NALAZ_RELATIONS_ORGANIZA')
alter table "Se nalazi"
   drop constraint "FK_SE NALAZ_RELATIONS_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Se nalazi"') and o.name = 'FK_SE NALAZ_SE NALAZI_INVENTAR')
alter table "Se nalazi"
   drop constraint "FK_SE NALAZ_SE NALAZI_INVENTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sistem ili podsistem"') and o.name = 'FK_SISTEM I_RESURSI P_POSLOVNI')
alter table "Sistem ili podsistem"
   drop constraint "FK_SISTEM I_RESURSI P_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloena organizaciona jedinica"') and o.name = 'FK_SLOENA _MATICNA O_ORGANIZA')
alter table "Sloena organizaciona jedinica"
   drop constraint "FK_SLOENA _MATICNA O_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloena organizaciona jedinica"') and o.name = 'FK_SLOENA _ORGANIZAC_ORGANIZA')
alter table "Sloena organizaciona jedinica"
   drop constraint "FK_SLOENA _ORGANIZAC_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloeni poslovni sistem"') and o.name = 'FK_SLOENI _MATICNI P_POSLOVNI')
alter table "Sloeni poslovni sistem"
   drop constraint "FK_SLOENI _MATICNI P_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloeni poslovni sistem"') and o.name = 'FK_SLOENI _SISTEM U _POSLOVNI')
alter table "Sloeni poslovni sistem"
   drop constraint "FK_SLOENI _SISTEM U _POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloeni poslovni sistem"') and o.name = 'FK_SLOENI _TIPIZACIJ_TIP SLO')
alter table "Sloeni poslovni sistem"
   drop constraint "FK_SLOENI _TIPIZACIJ_TIP SLO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Steta') and o.name = 'FK_STETA_JE OSTECE_VOZILO')
alter table Steta
   drop constraint "FK_STETA_JE OSTECE_VOZILO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Steta') and o.name = 'FK_STETA_JE POPRAV_POSLOVNI')
alter table Steta
   drop constraint "FK_STETA_JE POPRAV_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Struktura atributa"') and o.name = 'FK_STRUKTUR_ATRIBUT_ATRIBUT')
alter table "Struktura atributa"
   drop constraint FK_STRUKTUR_ATRIBUT_ATRIBUT
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Struktura atributa"') and o.name = 'FK_STRUKTUR_SADRANI _ATRIBUT')
alter table "Struktura atributa"
   drop constraint "FK_STRUKTUR_SADRANI _ATRIBUT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Tabela') and o.name = 'FK_TABELA_RESURSI P_POSLOVNI')
alter table Tabela
   drop constraint "FK_TABELA_RESURSI P_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Trajni materijalni resurs"') and o.name = 'FK_TRAJNI M_TIPIZACIJ_TIP TRAJ')
alter table "Trajni materijalni resurs"
   drop constraint "FK_TRAJNI M_TIPIZACIJ_TIP TRAJ"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor o nabavci"') and o.name = 'FK_UGOVOR O_DAVALAC_POSLOVNI')
alter table "Ugovor o nabavci"
   drop constraint "FK_UGOVOR O_DAVALAC_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor o nabavci"') and o.name = 'FK_UGOVOR O_NARUCIOC_POSLOVNI')
alter table "Ugovor o nabavci"
   drop constraint "FK_UGOVOR O_NARUCIOC_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor o nabavci"') and o.name = 'FK_UGOVOR O_POTPISNIK_REGISTAR')
alter table "Ugovor o nabavci"
   drop constraint "FK_UGOVOR O_POTPISNIK_REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor o nabavci"') and o.name = 'FK_UGOVOR O_VRSTA NAB_TIP NABA')
alter table "Ugovor o nabavci"
   drop constraint "FK_UGOVOR O_VRSTA NAB_TIP NABA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor rezervacije"') and o.name = 'FK_UGOVOR R_JE UGOVOR_REZERVAC')
alter table "Ugovor rezervacije"
   drop constraint "FK_UGOVOR R_JE UGOVOR_REZERVAC"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor rezervacije"') and o.name = 'FK_UGOVOR R_SA_KLIJENT')
alter table "Ugovor rezervacije"
   drop constraint "FK_UGOVOR R_SA_KLIJENT"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Ugovor rezervacije"') and o.name = 'FK_UGOVOR R_SKLAPA_POSLOVNI')
alter table "Ugovor rezervacije"
   drop constraint "FK_UGOVOR R_SKLAPA_POSLOVNI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Vozilo') and o.name = 'FK_VOZILO_JE NABAVL_UGOVOR O')
alter table Vozilo
   drop constraint "FK_VOZILO_JE NABAVL_UGOVOR O"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Vozilo') and o.name = 'FK_VOZILO_RELATIONS_TRAJNI M')
alter table Vozilo
   drop constraint "FK_VOZILO_RELATIONS_TRAJNI M"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Vozilo') and o.name = 'FK_VOZILO_STANJE VO_STATUS V')
alter table Vozilo
   drop constraint "FK_VOZILO_STANJE VO_STATUS V"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Vozilo') and o.name = 'FK_VOZILO_KOSTA_CIJENA')
alter table Vozilo
   drop constraint FK_VOZILO_KOSTA_CIJENA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Vozilo') and o.name = 'FK_VOZILO_OSIGURAVA_POSLOVNI')
alter table Vozilo
   drop constraint FK_VOZILO_OSIGURAVA_POSLOVNI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Vozilo') and o.name = 'FK_VOZILO_TRENUTNA _ORGANIZA')
alter table Vozilo
   drop constraint "FK_VOZILO_TRENUTNA _ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Vozilo drumskog saobracaja"') and o.name = 'FK_VOZILO D_MOZE BITI_VOZILO')
alter table "Vozilo drumskog saobracaja"
   drop constraint "FK_VOZILO D_MOZE BITI_VOZILO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Vozilo drumskog saobracaja"') and o.name = 'FK_VOZILO D_MOZE BITI_TIP MOTO')
alter table "Vozilo drumskog saobracaja"
   drop constraint "FK_VOZILO D_MOZE BITI_TIP MOTO"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Vozilo drumskog saobracaja"') and o.name = 'FK_VOZILO D_PRIPADA K_KLASA')
alter table "Vozilo drumskog saobracaja"
   drop constraint "FK_VOZILO D_PRIPADA K_KLASA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Školska sprema"') and o.name = 'FK_ŠKOLSKA _KOJE ŠKOL_NIVO OBR')
alter table "Školska sprema"
   drop constraint "FK_ŠKOLSKA _KOJE ŠKOL_NIVO OBR"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Adresni podaci"')
            and   name  = 'Mjesto adrese_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Adresni podaci"."Mjesto adrese_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Adresni podaci"')
            and   name  = 'Kontakt podaci_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Adresni podaci"."Kontakt podaci_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Adresni podaci"')
            and   name  = 'Kod drugog pravnog lica_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Adresni podaci"."Kod drugog pravnog lica_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Adresni podaci"')
            and   type = 'U')
   drop table "Adresni podaci"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Atribut')
            and   name  = 'Resursi poslovnog sistema2_FK'
            and   indid > 0
            and   indid < 255)
   drop index Atribut."Resursi poslovnog sistema2_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Atribut')
            and   type = 'U')
   drop table Atribut
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Cijena')
            and   type = 'U')
   drop table Cijena
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Drava')
            and   name  = 'Tekuce uredenje_FK'
            and   indid > 0
            and   indid < 255)
   drop index Drava."Tekuce uredenje_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Drava')
            and   name  = 'Glavni grad_FK'
            and   indid > 0
            and   indid < 255)
   drop index Drava."Glavni grad_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Drava')
            and   type = 'U')
   drop table Drava
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Dravljanstvo')
            and   name  = 'Dravljanstvo_FK'
            and   indid > 0
            and   indid < 255)
   drop index Dravljanstvo.Dravljanstvo_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Dravljanstvo')
            and   name  = 'Dravljanstvo2_FK'
            and   indid > 0
            and   indid < 255)
   drop index Dravljanstvo.Dravljanstvo2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Dravljanstvo')
            and   type = 'U')
   drop table Dravljanstvo
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Dravno uredenje"')
            and   type = 'U')
   drop table "Dravno uredenje"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Glavni grad"')
            and   name  = 'Glavni grad u dravi_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Glavni grad"."Glavni grad u dravi_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Glavni grad"')
            and   name  = 'Glavni grad_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Glavni grad"."Glavni grad_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Glavni grad"')
            and   type = 'U')
   drop table "Glavni grad"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Inventar')
            and   name  = 'Tipizacija inventara_FK'
            and   indid > 0
            and   indid < 255)
   drop index Inventar."Tipizacija inventara_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Inventar')
            and   name  = 'Pripada3_FK'
            and   indid > 0
            and   indid < 255)
   drop index Inventar.Pripada3_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Inventar')
            and   type = 'U')
   drop table Inventar
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija uredenja"')
            and   name  = 'Uredenje drave_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija uredenja"."Uredenje drave_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija uredenja"')
            and   name  = 'Kroz istoriju_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija uredenja"."Kroz istoriju_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija uredenja"')
            and   type = 'U')
   drop table "Istorija uredenja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Izabrani tipovi organizacione jedinice"')
            and   name  = 'Izbor tipizacije po poslovnom sistemu_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Izabrani tipovi organizacione jedinice"."Izbor tipizacije po poslovnom sistemu_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Izabrani tipovi organizacione jedinice"')
            and   name  = 'Izabrana tipizacija organizacione jedinice_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Izabrani tipovi organizacione jedinice"."Izabrana tipizacija organizacione jedinice_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Izabrani tipovi organizacione jedinice"')
            and   type = 'U')
   drop table "Izabrani tipovi organizacione jedinice"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Iznajmljena vozila"')
            and   name  = 'vraca iznajmljeno vozilo_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Iznajmljena vozila"."vraca iznajmljeno vozilo_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Iznajmljena vozila"')
            and   name  = 'prijem vozila_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Iznajmljena vozila"."prijem vozila_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Iznajmljena vozila"')
            and   name  = 'preuzima iznajmljeno vozilo_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Iznajmljena vozila"."preuzima iznajmljeno vozilo_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Iznajmljena vozila"')
            and   name  = 'predao vozilo_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Iznajmljena vozila"."predao vozilo_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Iznajmljena vozila"')
            and   name  = 'je rezervisano_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Iznajmljena vozila"."je rezervisano_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Iznajmljena vozila"')
            and   name  = 'je iznajmljeno_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Iznajmljena vozila"."je iznajmljeno_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Iznajmljena vozila"')
            and   type = 'U')
   drop table "Iznajmljena vozila"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Katalog radnih mjesta"')
            and   name  = 'Ima radna mjesta_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Katalog radnih mjesta"."Ima radna mjesta_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Katalog radnih mjesta"')
            and   type = 'U')
   drop table "Katalog radnih mjesta"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Katalog zanimanja"')
            and   name  = 'Registrovana zanimanja_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Katalog zanimanja"."Registrovana zanimanja_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Katalog zanimanja"')
            and   type = 'U')
   drop table "Katalog zanimanja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Katalog zvanja"')
            and   name  = 'Katalog zvanja_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Katalog zvanja"."Katalog zvanja_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Katalog zvanja"')
            and   type = 'U')
   drop table "Katalog zvanja"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Klasa')
            and   type = 'U')
   drop table Klasa
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Klijent')
            and   name  = 'vrsta lica_FK'
            and   indid > 0
            and   indid < 255)
   drop index Klijent."vrsta lica_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Klijent')
            and   type = 'U')
   drop table Klijent
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Korisnicki nalog"')
            and   name  = 'Registrovani korisnici_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Korisnicki nalog"."Registrovani korisnici_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Korisnicki nalog"')
            and   name  = 'Nalog zaposlenog_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Korisnicki nalog"."Nalog zaposlenog_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Korisnicki nalog"')
            and   type = 'U')
   drop table "Korisnicki nalog"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Lista zvanja"')
            and   name  = 'Obuhvata zvanja_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Lista zvanja"."Obuhvata zvanja_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Lista zvanja"')
            and   name  = 'Lista zvanja_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Lista zvanja"."Lista zvanja_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Lista zvanja"')
            and   type = 'U')
   drop table "Lista zvanja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Mjesna zajednica"')
            and   name  = 'Mjesna kancelarija_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Mjesna zajednica"."Mjesna kancelarija_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Mjesna zajednica"')
            and   name  = 'Ima mjesne zajednice_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Mjesna zajednica"."Ima mjesne zajednice_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Mjesna zajednica"')
            and   type = 'U')
   drop table "Mjesna zajednica"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Mjesno pokrivanje naselja"')
            and   name  = 'Mjesno pokrivanje naselja_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Mjesno pokrivanje naselja"."Mjesno pokrivanje naselja_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Mjesno pokrivanje naselja"')
            and   name  = 'Mjesno pokrivanje naselja2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Mjesno pokrivanje naselja"."Mjesno pokrivanje naselja2_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Mjesno pokrivanje naselja"')
            and   type = 'U')
   drop table "Mjesno pokrivanje naselja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Naseljeno mjesto"')
            and   name  = 'Sadri naselja_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Naseljeno mjesto"."Sadri naselja_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Naseljeno mjesto"')
            and   type = 'U')
   drop table "Naseljeno mjesto"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Nivo obrazovanja"')
            and   type = 'U')
   drop table "Nivo obrazovanja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obrazuju za"')
            and   name  = 'Školske spreme_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obrazuju za"."Školske spreme_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obrazuju za"')
            and   name  = 'Obrazuju za2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obrazuju za"."Obrazuju za2_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Obrazuju za"')
            and   type = 'U')
   drop table "Obrazuju za"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obuhvata naselja"')
            and   name  = 'Obuhvata naselja_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obuhvata naselja"."Obuhvata naselja_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obuhvata naselja"')
            and   name  = 'Obuhvata naselja2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obuhvata naselja"."Obuhvata naselja2_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Obuhvata naselja"')
            and   type = 'U')
   drop table "Obuhvata naselja"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obuhvata opštine"')
            and   name  = 'Obuhvata opštine_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obuhvata opštine"."Obuhvata opštine_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Obuhvata opštine"')
            and   name  = 'Obuhvata opštine2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Obuhvata opštine"."Obuhvata opštine2_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Obuhvata opštine"')
            and   type = 'U')
   drop table "Obuhvata opštine"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Odrzavanje')
            and   name  = 'se odrzava_FK'
            and   indid > 0
            and   indid < 255)
   drop index Odrzavanje."se odrzava_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Odrzavanje')
            and   name  = 'odrzava_FK'
            and   indid > 0
            and   indid < 255)
   drop index Odrzavanje.odrzava_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Odrzavanje')
            and   type = 'U')
   drop table Odrzavanje
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Odsjek')
            and   name  = 'tipizacija_FK'
            and   indid > 0
            and   indid < 255)
   drop index Odsjek.tipizacija_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Odsjek')
            and   type = 'U')
   drop table Odsjek
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Opština')
            and   name  = 'Središte opštine_FK'
            and   indid > 0
            and   indid < 255)
   drop index Opština."Središte opštine_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Opština')
            and   name  = 'Lokalna samouprava_FK'
            and   indid > 0
            and   indid < 255)
   drop index Opština."Lokalna samouprava_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Opština')
            and   type = 'U')
   drop table Opština
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Organizacija trajnih resursa"')
            and   name  = 'pripadnost poslovnici_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Organizacija trajnih resursa"."pripadnost poslovnici_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Organizacija trajnih resursa"')
            and   name  = 'resurs dodijeljen_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Organizacija trajnih resursa"."resurs dodijeljen_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Organizacija trajnih resursa"')
            and   type = 'U')
   drop table "Organizacija trajnih resursa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Organizaciona jedinica"')
            and   name  = 'Unutrašnja organizacija_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Organizaciona jedinica"."Unutrašnja organizacija_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Organizaciona jedinica"')
            and   name  = 'Tipizacija organizacione jedinice_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Organizaciona jedinica"."Tipizacija organizacione jedinice_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Organizaciona jedinica"')
            and   name  = 'Sjedište organizacione jedinice_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Organizaciona jedinica"."Sjedište organizacione jedinice_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Organizaciona jedinica"')
            and   type = 'U')
   drop table "Organizaciona jedinica"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Organizaciona sema"')
            and   name  = 'ima_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Organizaciona sema".ima_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Organizaciona sema"')
            and   type = 'U')
   drop table "Organizaciona sema"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ostali materijalni resursi"')
            and   name  = 'Relationship_28_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ostali materijalni resursi".Relationship_28_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Ostali materijalni resursi"')
            and   type = 'U')
   drop table "Ostali materijalni resursi"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Personalna restrikcija"')
            and   name  = 'Personalna restrikcija tabela_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Personalna restrikcija"."Personalna restrikcija tabela_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Personalna restrikcija"')
            and   name  = 'Personalna restrikcija atributa_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Personalna restrikcija"."Personalna restrikcija atributa_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Personalna restrikcija"')
            and   name  = 'Personalna restrikcija2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Personalna restrikcija"."Personalna restrikcija2_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Personalna restrikcija"')
            and   type = 'U')
   drop table "Personalna restrikcija"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Plovno vozilo"')
            and   name  = 'vrsta broda_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Plovno vozilo"."vrsta broda_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Plovno vozilo"')
            and   name  = 'vrsta pogona_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Plovno vozilo"."vrsta pogona_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Plovno vozilo"')
            and   name  = 'Moze biti3_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Plovno vozilo"."Moze biti3_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Plovno vozilo"')
            and   type = 'U')
   drop table "Plovno vozilo"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Podaci o obrazovanju"')
            and   name  = 'Tipizacija školske sprema_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Podaci o obrazovanju"."Tipizacija školske sprema_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Podaci o obrazovanju"')
            and   name  = 'Tipizacija zvanja_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Podaci o obrazovanju"."Tipizacija zvanja_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Podaci o obrazovanju"')
            and   name  = 'Podaci o obrazovanju_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Podaci o obrazovanju"."Podaci o obrazovanju_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Podaci o obrazovanju"')
            and   name  = 'Obrazovna ustanova_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Podaci o obrazovanju"."Obrazovna ustanova_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Podaci o obrazovanju"')
            and   type = 'U')
   drop table "Podaci o obrazovanju"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Pogon')
            and   type = 'U')
   drop table Pogon
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovna hijerarhija"')
            and   name  = 'u sklopu organizacione jedinice_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovna hijerarhija"."u sklopu organizacione jedinice_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovna hijerarhija"')
            and   name  = 'podredjena pozicija_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovna hijerarhija"."podredjena pozicija_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovna hijerarhija"')
            and   name  = 'podredjena grupa_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovna hijerarhija"."podredjena grupa_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovna hijerarhija"')
            and   name  = 'nadredjena pozicija_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovna hijerarhija"."nadredjena pozicija_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovna hijerarhija"')
            and   name  = 'nadredjena grupa_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovna hijerarhija"."nadredjena grupa_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovna hijerarhija"')
            and   name  = 'hijerarhije unutar organizacione seme_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovna hijerarhija"."hijerarhije unutar organizacione seme_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Poslovna hijerarhija"')
            and   type = 'U')
   drop table "Poslovna hijerarhija"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovni sistem"')
            and   name  = 'Pripada2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovni sistem".Pripada2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovni sistem"')
            and   name  = 'Tipizacija poslovnog sistema_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovni sistem"."Tipizacija poslovnog sistema_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovni sistem"')
            and   name  = 'Sjedište poslovnog sistema_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovni sistem"."Sjedište poslovnog sistema_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovni sistem"')
            and   name  = 'Pravni sljedbenik_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovni sistem"."Pravni sljedbenik_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Poslovni sistem"')
            and   name  = 'Drava poslovnog sistema_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Poslovni sistem"."Drava poslovnog sistema_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Poslovni sistem"')
            and   type = 'U')
   drop table "Poslovni sistem"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Potrebna školska sprema"')
            and   name  = 'Školska sprema za radno mjesto_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Potrebna školska sprema"."Školska sprema za radno mjesto_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Potrebna školska sprema"')
            and   name  = 'Potrebna školska sprema_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Potrebna školska sprema"."Potrebna školska sprema_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Potrebna školska sprema"')
            and   type = 'U')
   drop table "Potrebna školska sprema"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Potrebne spreme"')
            and   name  = 'Potrebne spreme2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Potrebne spreme"."Potrebne spreme2_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Potrebne spreme"')
            and   name  = 'Potrebne spreme_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Potrebne spreme"."Potrebne spreme_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Potrebne spreme"')
            and   type = 'U')
   drop table "Potrebne spreme"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Povezana sa"')
            and   name  = 'Povezana tabela_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Povezana sa"."Povezana tabela_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Povezana sa"')
            and   name  = 'Tabela_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Povezana sa".Tabela_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Povezana sa"')
            and   type = 'U')
   drop table "Povezana sa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pozicija u organizacionoj jedinici"')
            and   name  = 'zaposlen unutar_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pozicija u organizacionoj jedinici"."zaposlen unutar_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pozicija u organizacionoj jedinici"')
            and   name  = 'na poziciji_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pozicija u organizacionoj jedinici"."na poziciji_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Pozicija u organizacionoj jedinici"')
            and   type = 'U')
   drop table "Pozicija u organizacionoj jedinici"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pravni nasljednik"')
            and   name  = 'Nasljedena drava_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pravni nasljednik"."Nasljedena drava_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pravni nasljednik"')
            and   name  = 'Drava pravni nasljednik_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pravni nasljednik"."Drava pravni nasljednik_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Pravni nasljednik"')
            and   type = 'U')
   drop table "Pravni nasljednik"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pravo na podsistem"')
            and   name  = 'Rola obuhvata sistem_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pravo na podsistem"."Rola obuhvata sistem_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pravo na podsistem"')
            and   name  = 'Sistem pripada roli_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pravo na podsistem"."Sistem pripada roli_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Pravo na podsistem"')
            and   type = 'U')
   drop table "Pravo na podsistem"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Predefinisane role radnih mjesta"')
            and   name  = 'Predefinisane role radnih mjesta2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Predefinisane role radnih mjesta"."Predefinisane role radnih mjesta2_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Predefinisane role radnih mjesta"')
            and   name  = 'Predefinisane role radnih mjesta_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Predefinisane role radnih mjesta"."Predefinisane role radnih mjesta_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Predefinisane role radnih mjesta"')
            and   type = 'U')
   drop table "Predefinisane role radnih mjesta"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Prikolica')
            and   name  = 'tipizacija prikolice_FK'
            and   indid > 0
            and   indid < 255)
   drop index Prikolica."tipizacija prikolice_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Prikolica')
            and   name  = 'Moze biti2_FK'
            and   indid > 0
            and   indid < 255)
   drop index Prikolica."Moze biti2_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Prikolica')
            and   type = 'U')
   drop table Prikolica
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pripada roli"')
            and   name  = 'Svrstan u grupu_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pripada roli"."Svrstan u grupu_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pripada roli"')
            and   name  = 'Ko je u grupi_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pripada roli"."Ko je u grupi_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Pripada roli"')
            and   type = 'U')
   drop table "Pripada roli"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pripadnost odsjeku"')
            and   name  = 'pripada_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pripadnost odsjeku".pripada_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pripadnost odsjeku"')
            and   name  = 'pozicija_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pripadnost odsjeku".pozicija_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Pripadnost odsjeku"')
            and   type = 'U')
   drop table "Pripadnost odsjeku"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pripadnost poslovnici"')
            and   name  = 'poslovnica kojoj pripada_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pripadnost poslovnici"."poslovnica kojoj pripada_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Pripadnost poslovnici"')
            and   name  = 'vozilo_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pripadnost poslovnici".vozilo_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Pripadnost poslovnici"')
            and   type = 'U')
   drop table "Pripadnost poslovnici"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Raspored na radna mjesta"')
            and   name  = 'Tipizacija radnog odnosa_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Raspored na radna mjesta"."Tipizacija radnog odnosa_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Raspored na radna mjesta"')
            and   name  = 'Raspored zaposlenog_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Raspored na radna mjesta"."Raspored zaposlenog_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Raspored na radna mjesta"')
            and   name  = 'Raspored zaposlenih_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Raspored na radna mjesta"."Raspored zaposlenih_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Raspored na radna mjesta"')
            and   name  = 'Kadrovi u organizacionoj jedinici_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Raspored na radna mjesta"."Kadrovi u organizacionoj jedinici_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Raspored na radna mjesta"')
            and   type = 'U')
   drop table "Raspored na radna mjesta"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Razmjena')
            and   name  = 'status_FK'
            and   indid > 0
            and   indid < 255)
   drop index Razmjena.status_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Razmjena')
            and   name  = 'zakazivanje razmjene_FK'
            and   indid > 0
            and   indid < 255)
   drop index Razmjena."zakazivanje razmjene_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Razmjena')
            and   type = 'U')
   drop table Razmjena
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Region')
            and   name  = 'Administrativno sjedište_FK'
            and   indid > 0
            and   indid < 255)
   drop index Region."Administrativno sjedište_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Region')
            and   name  = 'Maticna drava_FK'
            and   indid > 0
            and   indid < 255)
   drop index Region."Maticna drava_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Region')
            and   name  = 'Tipizacija regiona_FK'
            and   indid > 0
            and   indid < 255)
   drop index Region."Tipizacija regiona_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Region')
            and   type = 'U')
   drop table Region
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Registar zaposlenih"')
            and   name  = 'Zapošljava_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Registar zaposlenih".Zapošljava_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Registar zaposlenih"')
            and   type = 'U')
   drop table "Registar zaposlenih"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Restrikcija atributa"')
            and   name  = 'Rola obuhvata akcije_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Restrikcija atributa"."Rola obuhvata akcije_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Restrikcija atributa"')
            and   name  = 'Restrikcija atributa2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Restrikcija atributa"."Restrikcija atributa2_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Restrikcija atributa"')
            and   type = 'U')
   drop table "Restrikcija atributa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Restrikcija nad tabelama"')
            and   name  = 'Restrikcija nad tabelama2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Restrikcija nad tabelama"."Restrikcija nad tabelama2_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Restrikcija nad tabelama"')
            and   name  = 'Rola obuhvata tabele_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Restrikcija nad tabelama"."Rola obuhvata tabele_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Restrikcija nad tabelama"')
            and   type = 'U')
   drop table "Restrikcija nad tabelama"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Rezervacija')
            and   name  = 'rezervise_FK'
            and   indid > 0
            and   indid < 255)
   drop index Rezervacija.rezervise_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Rezervacija')
            and   name  = 'stanje_FK'
            and   indid > 0
            and   indid < 255)
   drop index Rezervacija.stanje_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Rezervacija')
            and   type = 'U')
   drop table Rezervacija
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Rola')
            and   name  = 'Role poslovnog sistema_FK'
            and   indid > 0
            and   indid < 255)
   drop index Rola."Role poslovnog sistema_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Rola')
            and   type = 'U')
   drop table Rola
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri atribute"')
            and   name  = 'Sadri atribute2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri atribute"."Sadri atribute2_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri atribute"')
            and   name  = 'Pripadaju tabeli_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri atribute"."Pripadaju tabeli_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sadri atribute"')
            and   type = 'U')
   drop table "Sadri atribute"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri podsisteme"')
            and   name  = 'Podsistem_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri podsisteme".Podsistem_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri podsisteme"')
            and   name  = 'Sistem_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri podsisteme".Sistem_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sadri podsisteme"')
            and   type = 'U')
   drop table "Sadri podsisteme"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri tabele"')
            and   name  = 'Pripadaju podsistemu_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri tabele"."Pripadaju podsistemu_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sadri tabele"')
            and   name  = 'Sadri tabele2_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sadri tabele"."Sadri tabele2_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sadri tabele"')
            and   type = 'U')
   drop table "Sadri tabele"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sastav drava"')
            and   name  = 'Drava clanica_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sastav drava"."Drava clanica_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sastav drava"')
            and   name  = 'Sloena drava_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sastav drava"."Sloena drava_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sastav drava"')
            and   type = 'U')
   drop table "Sastav drava"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sastav regiona"')
            and   name  = 'Sastavljeni region_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sastav regiona"."Sastavljeni region_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sastav regiona"')
            and   name  = 'Region u sastavu_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sastav regiona"."Region u sastavu_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sastav regiona"')
            and   type = 'U')
   drop table "Sastav regiona"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Se nalazi"')
            and   name  = 'Relationship_6_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Se nalazi".Relationship_6_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Se nalazi"')
            and   name  = 'se nalazi_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Se nalazi"."se nalazi_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Se nalazi"')
            and   type = 'U')
   drop table "Se nalazi"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sistem ili podsistem"')
            and   name  = 'Resursi poslovnog sistema3_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sistem ili podsistem"."Resursi poslovnog sistema3_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sistem ili podsistem"')
            and   type = 'U')
   drop table "Sistem ili podsistem"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloena organizaciona jedinica"')
            and   name  = 'Maticna organizaciona jedinica_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloena organizaciona jedinica"."Maticna organizaciona jedinica_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloena organizaciona jedinica"')
            and   name  = 'Organizaciona jedinica u sastavu_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloena organizaciona jedinica"."Organizaciona jedinica u sastavu_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sloena organizaciona jedinica"')
            and   type = 'U')
   drop table "Sloena organizaciona jedinica"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloeni poslovni sistem"')
            and   name  = 'Tipizacija sloenog poslovnog sistema_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloeni poslovni sistem"."Tipizacija sloenog poslovnog sistema_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloeni poslovni sistem"')
            and   name  = 'Sistem u sastavu_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloeni poslovni sistem"."Sistem u sastavu_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloeni poslovni sistem"')
            and   name  = 'Maticni poslovni sistem_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloeni poslovni sistem"."Maticni poslovni sistem_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sloeni poslovni sistem"')
            and   type = 'U')
   drop table "Sloeni poslovni sistem"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Status razmjene"')
            and   type = 'U')
   drop table "Status razmjene"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Status rezervacije"')
            and   type = 'U')
   drop table "Status rezervacije"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Status vozila"')
            and   type = 'U')
   drop table "Status vozila"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Steta')
            and   name  = 'je popravljena_FK'
            and   indid > 0
            and   indid < 255)
   drop index Steta."je popravljena_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Steta')
            and   name  = 'je osteceno_FK'
            and   indid > 0
            and   indid < 255)
   drop index Steta."je osteceno_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Steta')
            and   type = 'U')
   drop table Steta
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Struktura atributa"')
            and   name  = 'Atribut_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Struktura atributa".Atribut_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Struktura atributa"')
            and   name  = 'Sadrani atribut_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Struktura atributa"."Sadrani atribut_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Struktura atributa"')
            and   type = 'U')
   drop table "Struktura atributa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Tabela')
            and   name  = 'Resursi poslovnog sistema_FK'
            and   indid > 0
            and   indid < 255)
   drop index Tabela."Resursi poslovnog sistema_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Tabela')
            and   type = 'U')
   drop table Tabela
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Tip')
            and   type = 'U')
   drop table Tip
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip klijenta"')
            and   type = 'U')
   drop table "Tip klijenta"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip motornog vozila"')
            and   type = 'U')
   drop table "Tip motornog vozila"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip nabavke"')
            and   type = 'U')
   drop table "Tip nabavke"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip organizacione jedinice"')
            and   type = 'U')
   drop table "Tip organizacione jedinice"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip plovnog vozila"')
            and   type = 'U')
   drop table "Tip plovnog vozila"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip poslovnog sistema"')
            and   type = 'U')
   drop table "Tip poslovnog sistema"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip prikolice"')
            and   type = 'U')
   drop table "Tip prikolice"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip regiona"')
            and   type = 'U')
   drop table "Tip regiona"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip sektora"')
            and   type = 'U')
   drop table "Tip sektora"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip sloenog poslovnog sistema"')
            and   type = 'U')
   drop table "Tip sloenog poslovnog sistema"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip trajnog resursa"')
            and   type = 'U')
   drop table "Tip trajnog resursa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Trajni materijalni resurs"')
            and   name  = 'Tipizacija materijalnog resursa_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Trajni materijalni resurs"."Tipizacija materijalnog resursa_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Trajni materijalni resurs"')
            and   type = 'U')
   drop table "Trajni materijalni resurs"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ugovor o nabavci"')
            and   name  = 'vrsta nabavake_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ugovor o nabavci"."vrsta nabavake_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ugovor o nabavci"')
            and   name  = 'potpisnik_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ugovor o nabavci".potpisnik_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ugovor o nabavci"')
            and   name  = 'narucioc_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ugovor o nabavci".narucioc_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ugovor o nabavci"')
            and   name  = 'davalac_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ugovor o nabavci".davalac_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Ugovor o nabavci"')
            and   type = 'U')
   drop table "Ugovor o nabavci"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ugovor rezervacije"')
            and   name  = 'sklapa_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ugovor rezervacije".sklapa_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ugovor rezervacije"')
            and   name  = 'je ugovorena_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ugovor rezervacije"."je ugovorena_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Ugovor rezervacije"')
            and   name  = 'sa_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Ugovor rezervacije".sa_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Ugovor rezervacije"')
            and   type = 'U')
   drop table "Ugovor rezervacije"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Vozilo')
            and   name  = 'trenutna lokacija_FK'
            and   indid > 0
            and   indid < 255)
   drop index Vozilo."trenutna lokacija_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Vozilo')
            and   name  = 'kosta_FK'
            and   indid > 0
            and   indid < 255)
   drop index Vozilo.kosta_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Vozilo')
            and   name  = 'Stanje vozila_FK'
            and   indid > 0
            and   indid < 255)
   drop index Vozilo."Stanje vozila_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Vozilo')
            and   name  = 'osigurava_FK'
            and   indid > 0
            and   indid < 255)
   drop index Vozilo.osigurava_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Vozilo')
            and   name  = 'Relationship_27_FK'
            and   indid > 0
            and   indid < 255)
   drop index Vozilo.Relationship_27_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Vozilo')
            and   name  = 'Je nabavljeno po_FK'
            and   indid > 0
            and   indid < 255)
   drop index Vozilo."Je nabavljeno po_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('Vozilo')
            and   type = 'U')
   drop table Vozilo
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Vozilo drumskog saobracaja"')
            and   name  = 'Pripada klasi_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Vozilo drumskog saobracaja"."Pripada klasi_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Vozilo drumskog saobracaja"')
            and   name  = 'Moze biti_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Vozilo drumskog saobracaja"."Moze biti_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Vozilo drumskog saobracaja"')
            and   name  = 'Moze biti4_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Vozilo drumskog saobracaja"."Moze biti4_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Vozilo drumskog saobracaja"')
            and   type = 'U')
   drop table "Vozilo drumskog saobracaja"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Vrsta radnog odnosa"')
            and   type = 'U')
   drop table "Vrsta radnog odnosa"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Školska sprema"')
            and   name  = 'Koje školske spreme_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Školska sprema"."Koje školske spreme_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Školska sprema"')
            and   type = 'U')
   drop table "Školska sprema"
go

/*==============================================================*/
/* Table: "Adresni podaci"                                      */
/*==============================================================*/
create table "Adresni podaci" (
   Drzava               char(3)              not null,
   Identifikator        bigint               not null,
   Zaposleni            int                  not null,
   Tip                  char(1)              not null default 'P'
      constraint CKC_TIP_ADRESNI check (Tip in ('P','L')),
   "Redni broj"         smallint             not null,
   Drava               char(3)              not null,
   Mjesto               int                  not null,
   "Drava poslodavca"  char(3)              null,
   Poslodavac           bigint               null,
   Ulica                varchar(120)         null,
   Broj                 varchar(8)           null,
   "Fiksni telefon"     varchar(20)          null,
   "Mobilni telefon"    varchar(20)          null,
   email                varchar(60)          null,
   www                  varchar(120)         null,
   constraint "PK_ADRESNI PODACI" primary key (Drzava, Identifikator, Zaposleni, "Redni broj", Tip)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Adresni podaci"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Drzava'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Adresni podaci"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Drava'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Adresni podaci"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava poslodavca')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Drava poslodavca'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Drava poslodavca'
go

/*==============================================================*/
/* Index: "Kod drugog pravnog lica_FK"                          */
/*==============================================================*/




create nonclustered index "Kod drugog pravnog lica_FK" on "Adresni podaci" ("Drava poslodavca" ASC,
  Poslodavac ASC)
go

/*==============================================================*/
/* Index: "Kontakt podaci_FK"                                   */
/*==============================================================*/




create nonclustered index "Kontakt podaci_FK" on "Adresni podaci" (Drzava ASC,
  Identifikator ASC,
  Zaposleni ASC)
go

/*==============================================================*/
/* Index: "Mjesto adrese_FK"                                    */
/*==============================================================*/




create nonclustered index "Mjesto adrese_FK" on "Adresni podaci" (Drava ASC,
  Mjesto ASC)
go

/*==============================================================*/
/* Table: Atribut                                               */
/*==============================================================*/
create table Atribut (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Identifikator        bigint               not null,
   Naziv                varchar(120)         not null,
   Kod                  varchar(30)          not null,
   constraint PK_ATRIBUT primary key (Drzava, "Poslovni sistem", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Atribut')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Atribut', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Atribut', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Resursi poslovnog sistema2_FK"                       */
/*==============================================================*/




create nonclustered index "Resursi poslovnog sistema2_FK" on Atribut (Drzava ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: Cijena                                                */
/*==============================================================*/
create table Cijena (
   "Id cijene"          varchar(20)          not null,
   "Dnevna cijena"      decimal(15,2)        not null,
   "Sedmicna cijena"    decimal(15,2)        null,
   "Mjeseca cijena"     decimal(15,2)        null,
   constraint PK_CIJENA primary key ("Id cijene")
)
go

/*==============================================================*/
/* Table: Drava                                                */
/*==============================================================*/
create table Drava (
   Oznaka               char(3)              not null,
   Naziv                varchar(120)         not null,
   "Datum osnivanja"    datetime             not null,
   "Glavni grad"        int                  null,
   "Dravno uredenje"   char(1)              null,
   "Pozivni broj"       numeric(5)           null,
   Himna                varbinary(Max)       null,
   Grb                  image                null,
   Zastava              image                null,
   constraint PK_DRAVA primary key (Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Drava')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Drava', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Drava', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: "Glavni grad_FK"                                      */
/*==============================================================*/




create nonclustered index "Glavni grad_FK" on Drava (Oznaka ASC,
  "Glavni grad" ASC)
go

/*==============================================================*/
/* Index: "Tekuce uredenje_FK"                                  */
/*==============================================================*/




create nonclustered index "Tekuce uredenje_FK" on Drava ("Dravno uredenje" ASC)
go

/*==============================================================*/
/* Table: Dravljanstvo                                         */
/*==============================================================*/
create table Dravljanstvo (
   Drzava               char(3)              not null,
   Identifikator        bigint               not null,
   Zaposleni            int                  not null,
   Dravljanstvo        char(3)              not null,
   constraint PK_DRAVLJANSTVO primary key (Drzava, Identifikator, Zaposleni, Dravljanstvo)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Dravljanstvo')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Dravljanstvo', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Dravljanstvo', 'column', 'Drzava'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Dravljanstvo')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dravljanstvo')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Dravljanstvo', 'column', 'Dravljanstvo'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Dravljanstvo', 'column', 'Dravljanstvo'
go

/*==============================================================*/
/* Index: Dravljanstvo2_FK                                     */
/*==============================================================*/




create nonclustered index Dravljanstvo2_FK on Dravljanstvo (Dravljanstvo ASC)
go

/*==============================================================*/
/* Index: Dravljanstvo_FK                                      */
/*==============================================================*/




create nonclustered index Dravljanstvo_FK on Dravljanstvo (Drzava ASC,
  Identifikator ASC,
  Zaposleni ASC)
go

/*==============================================================*/
/* Table: "Dravno uredenje"                                    */
/*==============================================================*/
create table "Dravno uredenje" (
   Oznaka               char(1)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_DRAVNO UREĞENJE" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Glavni grad"                                         */
/*==============================================================*/
create table "Glavni grad" (
   Dr_Oznaka2          char(3)              not null,
   "Glavni grad"        int                  not null,
   "Redni broj"         numeric(1,0)         not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_GLAVNI GRAD" primary key (Dr_Oznaka2, "Glavni grad", "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Glavni grad"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka2')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Glavni grad', 'column', 'Dr_Oznaka2'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Glavni grad', 'column', 'Dr_Oznaka2'
go

/*==============================================================*/
/* Index: "Glavni grad_FK"                                      */
/*==============================================================*/




create nonclustered index "Glavni grad_FK" on "Glavni grad" (Dr_Oznaka2 ASC)
go

/*==============================================================*/
/* Index: "Glavni grad u dravi_FK"                             */
/*==============================================================*/




create nonclustered index "Glavni grad u dravi_FK" on "Glavni grad" (Dr_Oznaka2 ASC,
  "Glavni grad" ASC)
go

/*==============================================================*/
/* Table: Inventar                                              */
/*==============================================================*/
create table Inventar (
   ID                   int                  not null,
   "Oznaka tipa"        int                  not null,
   "Drzava poslovnog sistema" char(3)              not null,
   "Identifikator poslovnog sistema" bigint               not null,
   Naziv                varchar(25)          not null,
   Opis                 varchar(150)         null,
   Kolicina             int                  not null,
   "Cijena po jedinici" numeric(15,2)        not null,
   "Ukupna cijena nabavke" numeric(15,2)        not null,
   "Datum nabavke"      datetime             not null,
   constraint PK_INVENTAR primary key (ID)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Inventar')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava poslovnog sistema')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Inventar', 'column', 'Drzava poslovnog sistema'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Inventar', 'column', 'Drzava poslovnog sistema'
go

/*==============================================================*/
/* Index: Pripada3_FK                                           */
/*==============================================================*/




create nonclustered index Pripada3_FK on Inventar ("Drzava poslovnog sistema" ASC,
  "Identifikator poslovnog sistema" ASC)
go

/*==============================================================*/
/* Index: "Tipizacija inventara_FK"                             */
/*==============================================================*/




create nonclustered index "Tipizacija inventara_FK" on Inventar ("Oznaka tipa" ASC)
go

/*==============================================================*/
/* Table: "Istorija uredenja"                                   */
/*==============================================================*/
create table "Istorija uredenja" (
   Drava               char(3)              not null,
   "Redni broj"         numeric(2,0)         not null,
   "Dravno uredenje"   char(1)              not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ISTORIJA UREĞENJA" primary key (Drava, "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija uredenja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Istorija uredenja', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Istorija uredenja', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Kroz istoriju_FK"                                    */
/*==============================================================*/




create nonclustered index "Kroz istoriju_FK" on "Istorija uredenja" (Drava ASC)
go

/*==============================================================*/
/* Index: "Uredenje drave_FK"                                  */
/*==============================================================*/




create nonclustered index "Uredenje drave_FK" on "Istorija uredenja" ("Dravno uredenje" ASC)
go

/*==============================================================*/
/* Table: "Izabrani tipovi organizacione jedinice"              */
/*==============================================================*/
create table "Izabrani tipovi organizacione jedinice" (
   "Tip organizacione jedinice" char(1)              not null,
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Aktivan              bit                  not null,
   constraint "PK_IZABRANI TIPOVI ORGANIZACIO" primary key ("Tip organizacione jedinice", Drzava, "Poslovni sistem")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Izabrani tipovi organizacione jedinice"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Izabrani tipovi organizacione jedinice', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Izabrani tipovi organizacione jedinice', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Izabrana tipizacija organizacione jedinice_FK"       */
/*==============================================================*/




create nonclustered index "Izabrana tipizacija organizacione jedinice_FK" on "Izabrani tipovi organizacione jedinice" ("Tip organizacione jedinice" ASC)
go

/*==============================================================*/
/* Index: "Izbor tipizacije po poslovnom sistemu_FK"            */
/*==============================================================*/




create nonclustered index "Izbor tipizacije po poslovnom sistemu_FK" on "Izabrani tipovi organizacione jedinice" (Drzava ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Iznajmljena vozila"                                  */
/*==============================================================*/
create table "Iznajmljena vozila" (
   Oznaka               varchar(20)          not null,
   Rezervacija          int                  not null,
   "Broj vozila"        varchar(20)          not null,
   "Klijent rezervisao" varchar(30)          not null,
   "Klijent preuzeo"    varchar(30)          not null,
   "Klijent vratio"     varchar(30)          not null,
   Drzava               char(3)              not null,
   "Agencija predajnika" bigint               not null,
   "Broj predajnika"    int                  not null,
   "Agencija prijemnika" bigint               not null,
   "Broj prijemnika"    int                  not null,
   "Datum preuzimanja"  datetime             not null,
   "Vrijeme preuzimanja" datetime             not null,
   "Stanje brojila prije" float                null,
   "Stanje rezervoara prije" float                null,
   "Datum povratka"     datetime             null,
   "Vrijeme povratka"   datetime             null,
   "Stanje brojila poslije" float                null,
   "Stanje rezervoara poslije" float                null,
   "Opsta zapazanja"    varchar(200)         null,
   constraint "PK_IZNAJMLJENA VOZILA" primary key (Oznaka, "Broj vozila", "Klijent rezervisao", Rezervacija)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Iznajmljena vozila"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Iznajmljena vozila', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Iznajmljena vozila', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "je iznajmljeno_FK"                                   */
/*==============================================================*/




create nonclustered index "je iznajmljeno_FK" on "Iznajmljena vozila" ("Broj vozila" ASC)
go

/*==============================================================*/
/* Index: "je rezervisano_FK"                                   */
/*==============================================================*/




create nonclustered index "je rezervisano_FK" on "Iznajmljena vozila" ("Klijent rezervisao" ASC,
  Rezervacija ASC)
go

/*==============================================================*/
/* Index: "predao vozilo_FK"                                    */
/*==============================================================*/




create nonclustered index "predao vozilo_FK" on "Iznajmljena vozila" (Drzava ASC,
  "Agencija predajnika" ASC,
  "Broj predajnika" ASC)
go

/*==============================================================*/
/* Index: "preuzima iznajmljeno vozilo_FK"                      */
/*==============================================================*/




create nonclustered index "preuzima iznajmljeno vozilo_FK" on "Iznajmljena vozila" ("Klijent vratio" ASC)
go

/*==============================================================*/
/* Index: "prijem vozila_FK"                                    */
/*==============================================================*/




create nonclustered index "prijem vozila_FK" on "Iznajmljena vozila" (Drzava ASC,
  "Agencija prijemnika" ASC,
  "Broj prijemnika" ASC)
go

/*==============================================================*/
/* Index: "vraca iznajmljeno vozilo_FK"                         */
/*==============================================================*/




create nonclustered index "vraca iznajmljeno vozilo_FK" on "Iznajmljena vozila" ("Klijent preuzeo" ASC)
go

/*==============================================================*/
/* Table: "Katalog radnih mjesta"                               */
/*==============================================================*/
create table "Katalog radnih mjesta" (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Oznaka               numeric(4,0)         not null,
   "Naziv radnog mjesta" varchar(120)         not null,
   "Planski broj izvršilaca" numeric(3,0)         not null,
   constraint "PK_KATALOG RADNIH MJESTA" primary key (Drzava, "Poslovni sistem", Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Katalog radnih mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Katalog radnih mjesta', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Katalog radnih mjesta', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Ima radna mjesta_FK"                                 */
/*==============================================================*/




create nonclustered index "Ima radna mjesta_FK" on "Katalog radnih mjesta" (Drzava ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Katalog zanimanja"                                   */
/*==============================================================*/
create table "Katalog zanimanja" (
   Drava               char(3)              not null,
   Zanimanje            int                  not null,
   Naziv                varchar(120)         not null,
   constraint "PK_KATALOG ZANIMANJA" primary key (Drava, Zanimanje)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Katalog zanimanja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Katalog zanimanja', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Katalog zanimanja', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Registrovana zanimanja_FK"                           */
/*==============================================================*/




create nonclustered index "Registrovana zanimanja_FK" on "Katalog zanimanja" (Drava ASC)
go

/*==============================================================*/
/* Table: "Katalog zvanja"                                      */
/*==============================================================*/
create table "Katalog zvanja" (
   Dr_Oznaka           char(3)              not null,
   Oznaka               char(2)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_KATALOG ZVANJA" primary key (Dr_Oznaka, Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Katalog zvanja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Katalog zvanja', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Katalog zvanja', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: "Katalog zvanja_FK"                                   */
/*==============================================================*/




create nonclustered index "Katalog zvanja_FK" on "Katalog zvanja" (Dr_Oznaka ASC)
go

/*==============================================================*/
/* Table: Klasa                                                 */
/*==============================================================*/
create table Klasa (
   Oznaka               varchar(25)          not null,
   Naziv                varchar(200)         not null,
   Opis                 varchar(200)         null,
   constraint PK_KLASA primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: Klijent                                               */
/*==============================================================*/
create table Klijent (
   Identifikator        varchar(30)          not null,
   Tip                  varchar(20)          not null,
   Ime                  varchar(50)          not null,
   Adresa               varchar(120)         null,
   "Broj telefona"      varchar(11)          null,
   "E-mail"             varchar(50)          null,
   constraint PK_KLIJENT primary key (Identifikator)
)
go

/*==============================================================*/
/* Index: "vrsta lica_FK"                                       */
/*==============================================================*/




create nonclustered index "vrsta lica_FK" on Klijent (Tip ASC)
go

/*==============================================================*/
/* Table: "Korisnicki nalog"                                    */
/*==============================================================*/
create table "Korisnicki nalog" (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "User ID"            varchar(30)          not null,
   Zaposleni            int                  not null,
   Username             varchar(15)          not null,
   Password             varchar(256)         null,
   "Datum registracije" datetime             not null,
   Aktivan              bit                  not null,
   constraint "PK_KORISNICKI NALOG" primary key (Drzava, "Poslovni sistem", "User ID")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Korisnicki nalog"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Korisnicki nalog', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Korisnicki nalog', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Nalog zaposlenog_FK"                                 */
/*==============================================================*/




create nonclustered index "Nalog zaposlenog_FK" on "Korisnicki nalog" (Drzava ASC,
  "Poslovni sistem" ASC,
  Zaposleni ASC)
go

/*==============================================================*/
/* Index: "Registrovani korisnici_FK"                           */
/*==============================================================*/




create nonclustered index "Registrovani korisnici_FK" on "Korisnicki nalog" (Drzava ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Lista zvanja"                                        */
/*==============================================================*/
create table "Lista zvanja" (
   Dr_Oznaka           char(3)              not null,
   Zvanje               char(2)              not null,
   "Školska sprema"     char(2)              not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   constraint "PK_LISTA ZVANJA" primary key (Stepen, "Nivo obrazovanja", "Školska sprema", Dr_Oznaka, Zvanje)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Lista zvanja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Lista zvanja', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Lista zvanja', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: "Lista zvanja_FK"                                     */
/*==============================================================*/




create nonclustered index "Lista zvanja_FK" on "Lista zvanja" (Dr_Oznaka ASC,
  Zvanje ASC)
go

/*==============================================================*/
/* Index: "Obuhvata zvanja_FK"                                  */
/*==============================================================*/




create nonclustered index "Obuhvata zvanja_FK" on "Lista zvanja" (Stepen ASC,
  "Nivo obrazovanja" ASC,
  "Školska sprema" ASC)
go

/*==============================================================*/
/* Table: "Mjesna zajednica"                                    */
/*==============================================================*/
create table "Mjesna zajednica" (
   Dr_Oznaka           char(3)              null,
   "Oznaka opštine"     numeric(3,0)         not null,
   Identifikator        numeric(2,0)         not null,
   "Naziv mjesne zajednice" varchar(120)         not null,
   "Mjesna kancelarija" int                  null,
   constraint "PK_MJESNA ZAJEDNICA" primary key ("Oznaka opštine", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Mjesna zajednica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Mjesna zajednica', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Mjesna zajednica', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: "Ima mjesne zajednice_FK"                             */
/*==============================================================*/




create nonclustered index "Ima mjesne zajednice_FK" on "Mjesna zajednica" (Dr_Oznaka ASC,
  "Oznaka opštine" ASC)
go

/*==============================================================*/
/* Index: "Mjesna kancelarija_FK"                               */
/*==============================================================*/




create nonclustered index "Mjesna kancelarija_FK" on "Mjesna zajednica" (Dr_Oznaka ASC,
  "Mjesna kancelarija" ASC)
go

/*==============================================================*/
/* Table: "Mjesno pokrivanje naselja"                           */
/*==============================================================*/
create table "Mjesno pokrivanje naselja" (
   Dr_Oznaka           char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   "Naseljeno mjesto"   int                  not null,
   "Mjesna zajednica"   numeric(2,0)         not null,
   constraint "PK_MJESNO POKRIVANJE NASELJA" primary key ("Oznaka opštine", "Mjesna zajednica", "Naseljeno mjesto")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Mjesno pokrivanje naselja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Mjesno pokrivanje naselja', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Mjesno pokrivanje naselja', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: "Mjesno pokrivanje naselja2_FK"                       */
/*==============================================================*/




create nonclustered index "Mjesno pokrivanje naselja2_FK" on "Mjesno pokrivanje naselja" (Dr_Oznaka ASC,
  "Naseljeno mjesto" ASC)
go

/*==============================================================*/
/* Index: "Mjesno pokrivanje naselja_FK"                        */
/*==============================================================*/




create nonclustered index "Mjesno pokrivanje naselja_FK" on "Mjesno pokrivanje naselja" ("Oznaka opštine" ASC,
  "Mjesna zajednica" ASC)
go

/*==============================================================*/
/* Table: "Naseljeno mjesto"                                    */
/*==============================================================*/
create table "Naseljeno mjesto" (
   Drava               char(3)              not null,
   Oznaka               int                  not null,
   "Naziv mjesta"       varchar(120)         not null,
   "PTT oznaka"         varchar(12)          null,
   constraint "PK_NASELJENO MJESTO" primary key (Drava, Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Naseljeno mjesto"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Naseljeno mjesto', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Naseljeno mjesto', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Sadri naselja_FK"                                   */
/*==============================================================*/




create nonclustered index "Sadri naselja_FK" on "Naseljeno mjesto" (Drava ASC)
go

/*==============================================================*/
/* Table: "Nivo obrazovanja"                                    */
/*==============================================================*/
create table "Nivo obrazovanja" (
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   "Naziv nivoa"        varchar(120)         not null,
   constraint "PK_NIVO OBRAZOVANJA" primary key (Stepen, "Nivo obrazovanja")
)
go

/*==============================================================*/
/* Table: "Obrazuju za"                                         */
/*==============================================================*/
create table "Obrazuju za" (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Školska sprema"     char(2)              not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   constraint "PK_OBRAZUJU ZA" primary key (Stepen, "Nivo obrazovanja", "Školska sprema", Drzava, "Poslovni sistem")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Obrazuju za"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Obrazuju za', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Obrazuju za', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Obrazuju za2_FK"                                     */
/*==============================================================*/




create nonclustered index "Obrazuju za2_FK" on "Obrazuju za" (Drzava ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Index: "Školske spreme_FK"                                   */
/*==============================================================*/




create nonclustered index "Školske spreme_FK" on "Obrazuju za" (Stepen ASC,
  "Nivo obrazovanja" ASC,
  "Školska sprema" ASC)
go

/*==============================================================*/
/* Table: "Obuhvata naselja"                                    */
/*==============================================================*/
create table "Obuhvata naselja" (
   Oznaka               char(1)              not null,
   "Oznaka regiona"     smallint             not null,
   Drava               char(3)              not null,
   "Naseljeno mjesto"   int                  not null,
   constraint "PK_OBUHVATA NASELJA" primary key (Drava, "Naseljeno mjesto", Oznaka, "Oznaka regiona")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Obuhvata naselja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Obuhvata naselja', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Obuhvata naselja', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Obuhvata naselja2_FK"                                */
/*==============================================================*/




create nonclustered index "Obuhvata naselja2_FK" on "Obuhvata naselja" (Oznaka ASC,
  "Oznaka regiona" ASC)
go

/*==============================================================*/
/* Index: "Obuhvata naselja_FK"                                 */
/*==============================================================*/




create nonclustered index "Obuhvata naselja_FK" on "Obuhvata naselja" (Drava ASC,
  "Naseljeno mjesto" ASC)
go

/*==============================================================*/
/* Table: "Obuhvata opštine"                                    */
/*==============================================================*/
create table "Obuhvata opštine" (
   Dr_Oznaka           char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   "Naseljeno mjesto"   int                  not null,
   constraint "PK_OBUHVATA OPŠTINE" primary key ("Oznaka opštine", Dr_Oznaka, "Naseljeno mjesto")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Obuhvata opštine"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Obuhvata opštine', 'column', 'Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Obuhvata opštine', 'column', 'Dr_Oznaka'
go

/*==============================================================*/
/* Index: "Obuhvata opštine2_FK"                                */
/*==============================================================*/




create nonclustered index "Obuhvata opštine2_FK" on "Obuhvata opštine" (Dr_Oznaka ASC,
  "Naseljeno mjesto" ASC)
go

/*==============================================================*/
/* Index: "Obuhvata opštine_FK"                                 */
/*==============================================================*/




create nonclustered index "Obuhvata opštine_FK" on "Obuhvata opštine" (Dr_Oznaka ASC,
  "Oznaka opštine" ASC)
go

/*==============================================================*/
/* Table: Odrzavanje                                            */
/*==============================================================*/
create table Odrzavanje (
   "Broj vozila"        varchar(20)          not null,
   "Servis za odrzavanje" bigint               not null,
   Oznaka               varchar(20)          not null,
   "Vrijeme ostecenja"  datetime             not null,
   "Vrijeme popravke"   datetime             null,
   Tip                  varchar(30)          null,
   Opis                 varchar(120)         null,
   constraint PK_ODRZAVANJE primary key ("Broj vozila", "Servis za odrzavanje", Oznaka)
)
go

/*==============================================================*/
/* Index: odrzava_FK                                            */
/*==============================================================*/




create nonclustered index odrzava_FK on Odrzavanje ("Servis za odrzavanje" ASC)
go

/*==============================================================*/
/* Index: "se odrzava_FK"                                       */
/*==============================================================*/




create nonclustered index "se odrzava_FK" on Odrzavanje ("Broj vozila" ASC)
go

/*==============================================================*/
/* Table: Odsjek                                                */
/*==============================================================*/
create table Odsjek (
   Oznaka               numeric(4)           not null,
   Tip                  numeric(4)           not null,
   "Datum osnivanja"    datetime             null,
   "Datum ukidanja"     datetime             null,
   constraint PK_ODSJEK primary key (Oznaka)
)
go

/*==============================================================*/
/* Index: tipizacija_FK                                         */
/*==============================================================*/




create nonclustered index tipizacija_FK on Odsjek (Tip ASC)
go

/*==============================================================*/
/* Table: Opština                                               */
/*==============================================================*/
create table Opština (
   Oznaka               char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   "Naziv opštine"      varchar(120)         not null,
   "Sjedište opštine"   int                  null,
   constraint PK_OPŠTINA primary key (Oznaka, "Oznaka opštine")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Opština')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Opština', 'column', 'Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Opština', 'column', 'Oznaka'
go

/*==============================================================*/
/* Index: "Lokalna samouprava_FK"                               */
/*==============================================================*/




create nonclustered index "Lokalna samouprava_FK" on Opština (Oznaka ASC)
go

/*==============================================================*/
/* Index: "Središte opštine_FK"                                 */
/*==============================================================*/




create nonclustered index "Središte opštine_FK" on Opština (Oznaka ASC,
  "Sjedište opštine" ASC)
go

/*==============================================================*/
/* Table: "Organizacija trajnih resursa"                        */
/*==============================================================*/
create table "Organizacija trajnih resursa" (
   "Drzava poslovnice"  char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Organizaciona jedinica" numeric(4)           not null,
   Oznaka               int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ORGANIZACIJA TRAJNIH RESURS" primary key ("Drzava poslovnice", "Poslovni sistem", "Organizaciona jedinica", Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Organizacija trajnih resursa"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava poslovnice')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Organizacija trajnih resursa', 'column', 'Drzava poslovnice'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Organizacija trajnih resursa', 'column', 'Drzava poslovnice'
go

/*==============================================================*/
/* Index: "resurs dodijeljen_FK"                                */
/*==============================================================*/




create nonclustered index "resurs dodijeljen_FK" on "Organizacija trajnih resursa" (Oznaka ASC)
go

/*==============================================================*/
/* Index: "pripadnost poslovnici_FK"                            */
/*==============================================================*/




create nonclustered index "pripadnost poslovnici_FK" on "Organizacija trajnih resursa" ("Drzava poslovnice" ASC,
  "Poslovni sistem" ASC,
  "Organizaciona jedinica" ASC)
go

/*==============================================================*/
/* Table: "Organizaciona jedinica"                              */
/*==============================================================*/
create table "Organizaciona jedinica" (
   Oznaka               numeric(4)           not null,
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Drzava poslovnog sistema" char(3)              not null,
   "Tip organizacione jedinice" char(1)              not null,
   "Sjedište organizacione jedinice" int                  not null,
   Naziv                varchar(120)         not null,
   Adresa               varchar(120)         null,
   Telefon              varchar(11)          null,
   email                varchar(60)          null,
   constraint "PK_ORGANIZACIONA JEDINICA" primary key (Drzava, "Poslovni sistem", Oznaka, "Drzava poslovnog sistema")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Drzava'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava poslovnog sistema')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Drzava poslovnog sistema'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Drzava poslovnog sistema'
go

/*==============================================================*/
/* Index: "Sjedište organizacione jedinice_FK"                  */
/*==============================================================*/




create nonclustered index "Sjedište organizacione jedinice_FK" on "Organizaciona jedinica" ("Drzava poslovnog sistema" ASC,
  "Sjedište organizacione jedinice" ASC)
go

/*==============================================================*/
/* Index: "Tipizacija organizacione jedinice_FK"                */
/*==============================================================*/




create nonclustered index "Tipizacija organizacione jedinice_FK" on "Organizaciona jedinica" ("Tip organizacione jedinice" ASC,
  "Drzava poslovnog sistema" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Index: "Unutrašnja organizacija_FK"                          */
/*==============================================================*/




create nonclustered index "Unutrašnja organizacija_FK" on "Organizaciona jedinica" ("Drzava poslovnog sistema" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Organizaciona sema"                                  */
/*==============================================================*/
create table "Organizaciona sema" (
   "Drzava poslovnog sistema" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Redni broj"         int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ORGANIZACIONA SEMA" primary key ("Drzava poslovnog sistema", "Poslovni sistem", "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Organizaciona sema"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava poslovnog sistema')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Organizaciona sema', 'column', 'Drzava poslovnog sistema'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Organizaciona sema', 'column', 'Drzava poslovnog sistema'
go

/*==============================================================*/
/* Index: ima_FK                                                */
/*==============================================================*/




create nonclustered index ima_FK on "Organizaciona sema" ("Drzava poslovnog sistema" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Ostali materijalni resursi"                          */
/*==============================================================*/
create table "Ostali materijalni resursi" (
   Oznaka               int                  not null,
   "Oznaka resursa"     int                  null,
   Naziv                varchar(25)          not null,
   Opis                 varchar(150)         null,
   constraint "PK_OSTALI MATERIJALNI RESURSI" primary key (Oznaka)
)
go

/*==============================================================*/
/* Index: Relationship_28_FK                                    */
/*==============================================================*/




create nonclustered index Relationship_28_FK on "Ostali materijalni resursi" ("Oznaka resursa" ASC)
go

/*==============================================================*/
/* Table: "Personalna restrikcija"                              */
/*==============================================================*/
create table "Personalna restrikcija" (
   Atr_Dr_Oznaka       char(3)              not null,
   Atr_Pos_Identifikator bigint               not null,
   Tab_Dr_Oznaka       char(3)              not null,
   Tab_Pos_Identifikator bigint               not null,
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Tabela               bigint               not null,
   Atribut              bigint               not null,
   Korisnik             varchar(30)          not null,
   Rola                 char(2)              not null,
   Identifikator        bigint               not null,
   Dodavanje            bit                  not null,
   Brisanje             bit                  not null,
   Izmjena              bit                  not null,
   Pretraga             bit                  not null,
   constraint "PK_PERSONALNA RESTRIKCIJA" primary key (Atr_Dr_Oznaka, Atr_Pos_Identifikator, Atribut, Tab_Dr_Oznaka, Tab_Pos_Identifikator, Tabela, Drzava, "Poslovni sistem", Korisnik, Rola, Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Personalna restrikcija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Personalna restrikcija', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Personalna restrikcija', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Personalna restrikcija2_FK"                          */
/*==============================================================*/




create nonclustered index "Personalna restrikcija2_FK" on "Personalna restrikcija" (Drzava ASC,
  "Poslovni sistem" ASC,
  Korisnik ASC,
  Rola ASC,
  Identifikator ASC)
go

/*==============================================================*/
/* Index: "Personalna restrikcija atributa_FK"                  */
/*==============================================================*/




create nonclustered index "Personalna restrikcija atributa_FK" on "Personalna restrikcija" (Drzava ASC,
  "Poslovni sistem" ASC,
  Atribut ASC)
go

/*==============================================================*/
/* Index: "Personalna restrikcija tabela_FK"                    */
/*==============================================================*/




create nonclustered index "Personalna restrikcija tabela_FK" on "Personalna restrikcija" (Drzava ASC,
  "Poslovni sistem" ASC,
  Tabela ASC)
go

/*==============================================================*/
/* Table: "Plovno vozilo"                                       */
/*==============================================================*/
create table "Plovno vozilo" (
   "Broj vozila"        varchar(20)          not null,
   Oznaka               varchar(15)          not null,
   Pogon                varchar(25)          not null,
   Tip                  varchar(25)          not null,
   Model                varchar(30)          not null,
   Marka                varchar(30)          not null,
   Boja                 varchar(20)          null,
   "Stanje rezervoara"  float                null,
   "Radni sati"         numeric(9,2)         null,
   Deplasman            float                null,
   Gaz                  float                null,
   "Broj putnika"       numeric(6,0)         null,
   "Maksimalna brzina"  numeric(3,0)         null,
   Duzina               float                null,
   Posada               bit                  null,
   "Broj brodskog svjedocanstva" varchar(20)          null,
   constraint "PK_PLOVNO VOZILO" primary key ("Broj vozila", Oznaka)
)
go

/*==============================================================*/
/* Index: "Moze biti3_FK"                                       */
/*==============================================================*/




create nonclustered index "Moze biti3_FK" on "Plovno vozilo" ("Broj vozila" ASC)
go

/*==============================================================*/
/* Index: "vrsta pogona_FK"                                     */
/*==============================================================*/




create nonclustered index "vrsta pogona_FK" on "Plovno vozilo" (Pogon ASC)
go

/*==============================================================*/
/* Index: "vrsta broda_FK"                                      */
/*==============================================================*/




create nonclustered index "vrsta broda_FK" on "Plovno vozilo" (Tip ASC)
go

/*==============================================================*/
/* Table: "Podaci o obrazovanju"                                */
/*==============================================================*/
create table "Podaci o obrazovanju" (
   Kat_Dr_Oznaka       char(3)              not null,
   Reg_Identifikator    bigint               not null,
   Zaposleni            int                  not null,
   "Redni broj"         numeric(2,0)         not null,
   "Školska sprema"     char(2)              not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   Zvanje               char(2)              not null,
   Drzava               char(3)              null,
   "Obrazovna ustanova" bigint               null,
   "Datum upisa"        datetime             not null,
   "Datum završetka"    datetime             not null,
   "Datum diplomiranja" datetime             null,
   "Broj diplome"       varchar(14)          null,
   constraint "PK_PODACI O OBRAZOVANJU" primary key (Kat_Dr_Oznaka, Reg_Identifikator, Zaposleni, "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Podaci o obrazovanju"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Kat_Dr_Oznaka')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Kat_Dr_Oznaka'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Kat_Dr_Oznaka'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Podaci o obrazovanju"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Obrazovna ustanova_FK"                               */
/*==============================================================*/




create nonclustered index "Obrazovna ustanova_FK" on "Podaci o obrazovanju" (Drzava ASC,
  "Obrazovna ustanova" ASC)
go

/*==============================================================*/
/* Index: "Podaci o obrazovanju_FK"                             */
/*==============================================================*/




create nonclustered index "Podaci o obrazovanju_FK" on "Podaci o obrazovanju" (Kat_Dr_Oznaka ASC,
  Reg_Identifikator ASC,
  Zaposleni ASC)
go

/*==============================================================*/
/* Index: "Tipizacija zvanja_FK"                                */
/*==============================================================*/




create nonclustered index "Tipizacija zvanja_FK" on "Podaci o obrazovanju" (Kat_Dr_Oznaka ASC,
  Zvanje ASC)
go

/*==============================================================*/
/* Index: "Tipizacija školske sprema_FK"                        */
/*==============================================================*/




create nonclustered index "Tipizacija školske sprema_FK" on "Podaci o obrazovanju" (Stepen ASC,
  "Nivo obrazovanja" ASC,
  "Školska sprema" ASC)
go

/*==============================================================*/
/* Table: Pogon                                                 */
/*==============================================================*/
create table Pogon (
   Oznaka               varchar(25)          not null,
   Naziv                varchar(30)          not null,
   Opis                 varchar(120)         null,
   constraint PK_POGON primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Poslovna hijerarhija"                                */
/*==============================================================*/
create table "Poslovna hijerarhija" (
   "Redni broj"         int                  not null,
   "Poslovni sistem"    bigint               not null,
   "Drzava poslovnog sistema" char(3)              not null,
   "Nadredjeno radno mjesto" numeric(4,0)         not null,
   "Nadredjeni odsjek"  numeric(4)           null,
   "Podredjeno radno mjesto" numeric(4,0)         not null,
   "Podredjeni odsjek"  numeric(4)           null,
   "Organizaciona sema" int                  not null,
   "Vazeca za jedinicu" numeric(4)           null,
   constraint "PK_POSLOVNA HIJERARHIJA" primary key ("Drzava poslovnog sistema", "Poslovni sistem", "Organizaciona sema", "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Poslovna hijerarhija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava poslovnog sistema')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Poslovna hijerarhija', 'column', 'Drzava poslovnog sistema'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Poslovna hijerarhija', 'column', 'Drzava poslovnog sistema'
go

/*==============================================================*/
/* Index: "hijerarhije unutar organizacione seme_FK"            */
/*==============================================================*/




create nonclustered index "hijerarhije unutar organizacione seme_FK" on "Poslovna hijerarhija" ("Drzava poslovnog sistema" ASC,
  "Poslovni sistem" ASC,
  "Organizaciona sema" ASC)
go

/*==============================================================*/
/* Index: "nadredjena grupa_FK"                                 */
/*==============================================================*/




create nonclustered index "nadredjena grupa_FK" on "Poslovna hijerarhija" ("Nadredjeni odsjek" ASC)
go

/*==============================================================*/
/* Index: "nadredjena pozicija_FK"                              */
/*==============================================================*/




create nonclustered index "nadredjena pozicija_FK" on "Poslovna hijerarhija" ("Drzava poslovnog sistema" ASC,
  "Poslovni sistem" ASC,
  "Nadredjeno radno mjesto" ASC)
go

/*==============================================================*/
/* Index: "podredjena grupa_FK"                                 */
/*==============================================================*/




create nonclustered index "podredjena grupa_FK" on "Poslovna hijerarhija" ("Podredjeni odsjek" ASC)
go

/*==============================================================*/
/* Index: "podredjena pozicija_FK"                              */
/*==============================================================*/




create nonclustered index "podredjena pozicija_FK" on "Poslovna hijerarhija" ("Drzava poslovnog sistema" ASC,
  "Poslovni sistem" ASC,
  "Podredjeno radno mjesto" ASC)
go

/*==============================================================*/
/* Index: "u sklopu organizacione jedinice_FK"                  */
/*==============================================================*/




create nonclustered index "u sklopu organizacione jedinice_FK" on "Poslovna hijerarhija" ("Drzava poslovnog sistema" ASC,
  "Poslovni sistem" ASC,
  "Vazeca za jedinicu" ASC)
go

/*==============================================================*/
/* Table: "Poslovni sistem"                                     */
/*==============================================================*/
create table "Poslovni sistem" (
   Drzava               char(3)              not null,
   Identifikator        bigint               not null,
   "Tip poslovnog sistema" char(1)              not null,
   "Sjedište poslovnog sistema" int                  not null,
   Tra_Oznaka           int                  not null,
   Naziv                varchar(120)         not null,
   Adresa               varchar(120)         null,
   Telefon              varchar(11)          null,
   email                varchar(60)          null,
   www                  varchar(120)         null,
   "Registracioni broj" char(10)             not null,
   PIB                  char(11)             not null,
   "Datum registracije" datetime             not null,
   "Datum zatvaranja"   datetime             null,
   Memorandum           image                null,
   Logo                 image                null,
   Pecat                image                null,
   "Digitalni potpis"   image                null,
   "Drzava pravnog sljedbenika" char(3)              null,
   "Poslovni sistem sljedbenik" bigint               null,
   constraint "PK_POSLOVNI SISTEM" primary key (Drzava, Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Drzava'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava pravnog sljedbenika')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Drzava pravnog sljedbenika'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Drzava pravnog sljedbenika'
go

/*==============================================================*/
/* Index: "Drava poslovnog sistema_FK"                         */
/*==============================================================*/




create nonclustered index "Drava poslovnog sistema_FK" on "Poslovni sistem" (Drzava ASC)
go

/*==============================================================*/
/* Index: "Pravni sljedbenik_FK"                                */
/*==============================================================*/




create nonclustered index "Pravni sljedbenik_FK" on "Poslovni sistem" ("Drzava pravnog sljedbenika" ASC,
  "Poslovni sistem sljedbenik" ASC)
go

/*==============================================================*/
/* Index: "Sjedište poslovnog sistema_FK"                       */
/*==============================================================*/




create nonclustered index "Sjedište poslovnog sistema_FK" on "Poslovni sistem" (Drzava ASC,
  "Sjedište poslovnog sistema" ASC)
go

/*==============================================================*/
/* Index: "Tipizacija poslovnog sistema_FK"                     */
/*==============================================================*/




create nonclustered index "Tipizacija poslovnog sistema_FK" on "Poslovni sistem" ("Tip poslovnog sistema" ASC)
go

/*==============================================================*/
/* Index: Pripada2_FK                                           */
/*==============================================================*/




create nonclustered index Pripada2_FK on "Poslovni sistem" (Tra_Oznaka ASC)
go

/*==============================================================*/
/* Table: "Potrebna školska sprema"                             */
/*==============================================================*/
create table "Potrebna školska sprema" (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Radno mjesto"       numeric(4,0)         not null,
   "Školska sprema"     char(2)              not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   constraint "PK_POTREBNA ŠKOLSKA SPREMA" primary key (Drzava, "Poslovni sistem", "Radno mjesto", Stepen, "Nivo obrazovanja", "Školska sprema")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Potrebna školska sprema"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Potrebna školska sprema', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Potrebna školska sprema', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Potrebna školska sprema_FK"                          */
/*==============================================================*/




create nonclustered index "Potrebna školska sprema_FK" on "Potrebna školska sprema" (Stepen ASC,
  "Nivo obrazovanja" ASC,
  "Školska sprema" ASC)
go

/*==============================================================*/
/* Index: "Školska sprema za radno mjesto_FK"                   */
/*==============================================================*/




create nonclustered index "Školska sprema za radno mjesto_FK" on "Potrebna školska sprema" (Drzava ASC,
  "Poslovni sistem" ASC,
  "Radno mjesto" ASC)
go

/*==============================================================*/
/* Table: "Potrebne spreme"                                     */
/*==============================================================*/
create table "Potrebne spreme" (
   Drava               char(3)              not null,
   Zanimanje            int                  not null,
   "Školska sprema"     char(2)              not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   constraint "PK_POTREBNE SPREME" primary key (Stepen, "Nivo obrazovanja", "Školska sprema", Drava, Zanimanje)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Potrebne spreme"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Potrebne spreme', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Potrebne spreme', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Potrebne spreme_FK"                                  */
/*==============================================================*/




create nonclustered index "Potrebne spreme_FK" on "Potrebne spreme" (Stepen ASC,
  "Nivo obrazovanja" ASC,
  "Školska sprema" ASC)
go

/*==============================================================*/
/* Index: "Potrebne spreme2_FK"                                 */
/*==============================================================*/




create nonclustered index "Potrebne spreme2_FK" on "Potrebne spreme" (Drava ASC,
  Zanimanje ASC)
go

/*==============================================================*/
/* Table: "Povezana sa"                                         */
/*==============================================================*/
create table "Povezana sa" (
   Tab_Dr_Oznaka       char(3)              not null,
   Tab_Pos_Identifikator bigint               not null,
   Tab_Identifikator    bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Pos_Identifikator    bigint               not null,
   Identifikator        bigint               not null,
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Tabela               bigint               not null,
   "Povezana tabela"    bigint               not null,
   constraint "PK_POVEZANA SA" primary key (Tab_Dr_Oznaka, Tab_Pos_Identifikator, Tab_Identifikator, Dr_Oznaka, Pos_Identifikator, Identifikator, Tabela, Drzava, "Poslovni sistem", "Povezana tabela")
)
go

/*==============================================================*/
/* Index: Tabela_FK                                             */
/*==============================================================*/




create nonclustered index Tabela_FK on "Povezana sa" (Drzava ASC,
  "Poslovni sistem" ASC,
  Tabela ASC)
go

/*==============================================================*/
/* Index: "Povezana tabela_FK"                                  */
/*==============================================================*/




create nonclustered index "Povezana tabela_FK" on "Povezana sa" (Drzava ASC,
  "Poslovni sistem" ASC,
  "Povezana tabela" ASC)
go

/*==============================================================*/
/* Table: "Pozicija u organizacionoj jedinici"                  */
/*==============================================================*/
create table "Pozicija u organizacionoj jedinici" (
   "Organizaciona jedinica" numeric(4)           not null,
   "Radno mjesto"       numeric(4,0)         not null,
   "Drzava poslovnog sistema" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Redni broj"         int                  not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_POZICIJA U ORGANIZACIONOJ J" primary key ("Organizaciona jedinica", "Radno mjesto", "Drzava poslovnog sistema", "Poslovni sistem", "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pozicija u organizacionoj jedinici"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava poslovnog sistema')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Pozicija u organizacionoj jedinici', 'column', 'Drzava poslovnog sistema'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Pozicija u organizacionoj jedinici', 'column', 'Drzava poslovnog sistema'
go

/*==============================================================*/
/* Index: "na poziciji_FK"                                      */
/*==============================================================*/




create nonclustered index "na poziciji_FK" on "Pozicija u organizacionoj jedinici" ("Drzava poslovnog sistema" ASC,
  "Poslovni sistem" ASC,
  "Radno mjesto" ASC)
go

/*==============================================================*/
/* Index: "zaposlen unutar_FK"                                  */
/*==============================================================*/




create nonclustered index "zaposlen unutar_FK" on "Pozicija u organizacionoj jedinici" ("Drzava poslovnog sistema" ASC,
  "Poslovni sistem" ASC,
  "Organizaciona jedinica" ASC)
go

/*==============================================================*/
/* Table: "Pravni nasljednik"                                   */
/*==============================================================*/
create table "Pravni nasljednik" (
   Nasljednica          char(3)              not null,
   Nasljedena           char(3)              not null,
   constraint "PK_PRAVNI NASLJEDNIK" primary key (Nasljedena, Nasljednica)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pravni nasljednik"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Nasljednica')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Pravni nasljednik', 'column', 'Nasljednica'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Pravni nasljednik', 'column', 'Nasljednica'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pravni nasljednik"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Nasljedena')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Pravni nasljednik', 'column', 'Nasljedena'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Pravni nasljednik', 'column', 'Nasljedena'
go

/*==============================================================*/
/* Index: "Drava pravni nasljednik_FK"                         */
/*==============================================================*/




create nonclustered index "Drava pravni nasljednik_FK" on "Pravni nasljednik" (Nasljednica ASC)
go

/*==============================================================*/
/* Index: "Nasljedena drava_FK"                                */
/*==============================================================*/




create nonclustered index "Nasljedena drava_FK" on "Pravni nasljednik" (Nasljedena ASC)
go

/*==============================================================*/
/* Table: "Pravo na podsistem"                                  */
/*==============================================================*/
create table "Pravo na podsistem" (
   Sis_Dr_Oznaka       char(3)              not null,
   Pos_Identifikator    bigint               not null,
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Sistem               bigint               not null,
   Rola                 char(2)              not null,
   Pristup              bit                  not null,
   constraint "PK_PRAVO NA PODSISTEM" primary key (Sis_Dr_Oznaka, Pos_Identifikator, Sistem, Drzava, "Poslovni sistem", Rola)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pravo na podsistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Pravo na podsistem', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Pravo na podsistem', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Sistem pripada roli_FK"                              */
/*==============================================================*/




create nonclustered index "Sistem pripada roli_FK" on "Pravo na podsistem" (Drzava ASC,
  "Poslovni sistem" ASC,
  Sistem ASC)
go

/*==============================================================*/
/* Index: "Rola obuhvata sistem_FK"                             */
/*==============================================================*/




create nonclustered index "Rola obuhvata sistem_FK" on "Pravo na podsistem" (Drzava ASC,
  "Poslovni sistem" ASC,
  Rola ASC)
go

/*==============================================================*/
/* Table: "Predefinisane role radnih mjesta"                    */
/*==============================================================*/
create table "Predefinisane role radnih mjesta" (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Radno mjesto"       numeric(4,0)         not null,
   "Oznaka role"        char(2)              not null,
   constraint "PK_PREDEFINISANE ROLE RADNIH M" primary key (Drzava, "Poslovni sistem", "Oznaka role", "Radno mjesto")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Predefinisane role radnih mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Predefinisane role radnih mjesta', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Predefinisane role radnih mjesta', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Predefinisane role radnih mjesta_FK"                 */
/*==============================================================*/




create nonclustered index "Predefinisane role radnih mjesta_FK" on "Predefinisane role radnih mjesta" (Drzava ASC,
  "Poslovni sistem" ASC,
  "Oznaka role" ASC)
go

/*==============================================================*/
/* Index: "Predefinisane role radnih mjesta2_FK"                */
/*==============================================================*/




create nonclustered index "Predefinisane role radnih mjesta2_FK" on "Predefinisane role radnih mjesta" (Drzava ASC,
  "Poslovni sistem" ASC,
  "Radno mjesto" ASC)
go

/*==============================================================*/
/* Table: Prikolica                                             */
/*==============================================================*/
create table Prikolica (
   "Broj vozila"        varchar(20)          not null,
   Oznaka               varchar(10)          not null,
   Tip                  varchar(20)          null,
   Naziv                varchar(50)          not null,
   Masa                 float                null,
   "Ukupna nosivost"    float                null,
   "Broj osovina"       numeric(2,0)         null,
   "Broj tockova"       numeric(2,0)         null,
   Dimenzije            varchar(30)          null,
   Napomena             varchar(200)         null,
   constraint PK_PRIKOLICA primary key ("Broj vozila", Oznaka)
)
go

/*==============================================================*/
/* Index: "Moze biti2_FK"                                       */
/*==============================================================*/




create nonclustered index "Moze biti2_FK" on Prikolica ("Broj vozila" ASC)
go

/*==============================================================*/
/* Index: "tipizacija prikolice_FK"                             */
/*==============================================================*/




create nonclustered index "tipizacija prikolice_FK" on Prikolica (Tip ASC)
go

/*==============================================================*/
/* Table: "Pripada roli"                                        */
/*==============================================================*/
create table "Pripada roli" (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Oznaka role"        char(2)              not null,
   Korisnik             varchar(30)          not null,
   Identifikator        bigint               not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_PRIPADA ROLI" primary key (Drzava, "Poslovni sistem", Korisnik, "Oznaka role", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pripada roli"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Pripada roli', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Pripada roli', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Ko je u grupi_FK"                                    */
/*==============================================================*/




create nonclustered index "Ko je u grupi_FK" on "Pripada roli" (Drzava ASC,
  "Poslovni sistem" ASC,
  "Oznaka role" ASC)
go

/*==============================================================*/
/* Index: "Svrstan u grupu_FK"                                  */
/*==============================================================*/




create nonclustered index "Svrstan u grupu_FK" on "Pripada roli" (Drzava ASC,
  "Poslovni sistem" ASC,
  Korisnik ASC)
go

/*==============================================================*/
/* Table: "Pripadnost odsjeku"                                  */
/*==============================================================*/
create table "Pripadnost odsjeku" (
   "Drzava poslovnog sistema" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Radno mjesto"       numeric(4,0)         not null,
   Odsjek               numeric(4)           not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_PRIPADNOST ODSJEKU" primary key ("Drzava poslovnog sistema", "Poslovni sistem", "Radno mjesto", Odsjek)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pripadnost odsjeku"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava poslovnog sistema')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Pripadnost odsjeku', 'column', 'Drzava poslovnog sistema'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Pripadnost odsjeku', 'column', 'Drzava poslovnog sistema'
go

/*==============================================================*/
/* Index: pozicija_FK                                           */
/*==============================================================*/




create nonclustered index pozicija_FK on "Pripadnost odsjeku" (Odsjek ASC)
go

/*==============================================================*/
/* Index: pripada_FK                                            */
/*==============================================================*/




create nonclustered index pripada_FK on "Pripadnost odsjeku" ("Drzava poslovnog sistema" ASC,
  "Poslovni sistem" ASC,
  "Radno mjesto" ASC)
go

/*==============================================================*/
/* Table: "Pripadnost poslovnici"                               */
/*==============================================================*/
create table "Pripadnost poslovnici" (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Poslovnica           numeric(4)           not null,
   "Broj vozila"        varchar(20)          not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_PRIPADNOST POSLOVNICI" primary key (Drzava, "Poslovni sistem", Poslovnica, "Broj vozila")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pripadnost poslovnici"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Pripadnost poslovnici', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Pripadnost poslovnici', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: vozilo_FK                                             */
/*==============================================================*/




create nonclustered index vozilo_FK on "Pripadnost poslovnici" ("Broj vozila" ASC)
go

/*==============================================================*/
/* Index: "poslovnica kojoj pripada_FK"                         */
/*==============================================================*/




create nonclustered index "poslovnica kojoj pripada_FK" on "Pripadnost poslovnici" (Drzava ASC,
  "Poslovni sistem" ASC,
  Poslovnica ASC)
go

/*==============================================================*/
/* Table: "Raspored na radna mjesta"                            */
/*==============================================================*/
create table "Raspored na radna mjesta" (
   "Drzava poslovnog sistema" char(3)              not null,
   Reg_Identifikator    bigint               not null,
   Zaposleni            int                  not null,
   "Redni broj"         numeric(4,0)         not null,
   "Organizaciona jedinica" numeric(4)           null,
   "Vrsta radnog odnosa" char(2)              not null,
   "Radno mjesto"       numeric(4,0)         not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   "Sta godina"        numeric(2)           not null,
   "Sta mjeseci"       numeric(2)           not null,
   "Sta dana"          numeric(2)           not null,
   Drzava               char(3)              not null,
   constraint "PK_RASPORED NA RADNA MJESTA" primary key (Reg_Identifikator, Zaposleni, "Redni broj", "Drzava poslovnog sistema")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Raspored na radna mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava poslovnog sistema')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Drzava poslovnog sistema'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Drzava poslovnog sistema'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Raspored na radna mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Kadrovi u organizacionoj jedinici_FK"                */
/*==============================================================*/




create nonclustered index "Kadrovi u organizacionoj jedinici_FK" on "Raspored na radna mjesta" (Drzava ASC,
  Reg_Identifikator ASC,
  "Organizaciona jedinica" ASC,
  "Drzava poslovnog sistema" ASC)
go

/*==============================================================*/
/* Index: "Raspored zaposlenih_FK"                              */
/*==============================================================*/




create nonclustered index "Raspored zaposlenih_FK" on "Raspored na radna mjesta" ("Drzava poslovnog sistema" ASC,
  Reg_Identifikator ASC,
  "Radno mjesto" ASC)
go

/*==============================================================*/
/* Index: "Raspored zaposlenog_FK"                              */
/*==============================================================*/




create nonclustered index "Raspored zaposlenog_FK" on "Raspored na radna mjesta" ("Drzava poslovnog sistema" ASC,
  Reg_Identifikator ASC,
  Zaposleni ASC)
go

/*==============================================================*/
/* Index: "Tipizacija radnog odnosa_FK"                         */
/*==============================================================*/




create nonclustered index "Tipizacija radnog odnosa_FK" on "Raspored na radna mjesta" ("Vrsta radnog odnosa" ASC)
go

/*==============================================================*/
/* Table: Razmjena                                              */
/*==============================================================*/
create table Razmjena (
   Oznaka               varchar(20)          not null,
   "Iznajmljena vozila" varchar(20)          not null,
   "Broj vozila"        varchar(20)          not null,
   "Klijent rezervisao" varchar(30)          not null,
   Rezervacija          int                  not null,
   Status               varchar(20)          not null,
   Vrijeme              datetime             null,
   Lokacija             varchar(120)         null,
   Povratak             bit                  null,
   constraint PK_RAZMJENA primary key (Oznaka)
)
go

/*==============================================================*/
/* Index: "zakazivanje razmjene_FK"                             */
/*==============================================================*/




create nonclustered index "zakazivanje razmjene_FK" on Razmjena ("Iznajmljena vozila" ASC,
  "Broj vozila" ASC,
  "Klijent rezervisao" ASC,
  Rezervacija ASC)
go

/*==============================================================*/
/* Index: status_FK                                             */
/*==============================================================*/




create nonclustered index status_FK on Razmjena (Status ASC)
go

/*==============================================================*/
/* Table: Region                                                */
/*==============================================================*/
create table Region (
   "Tip regiona"        char(1)              not null,
   "Oznaka regiona"     smallint             not null,
   "Naziv regiona"      varchar(120)         not null,
   "Pripada dravi"     char(3)              null,
   "Drava sjedišta"    char(3)              null,
   "Administrativno sjedište" int                  null,
   constraint PK_REGION primary key ("Tip regiona", "Oznaka regiona")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Region')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pripada dravi')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Region', 'column', 'Pripada dravi'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Region', 'column', 'Pripada dravi'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Region')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava sjedišta')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Region', 'column', 'Drava sjedišta'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Region', 'column', 'Drava sjedišta'
go

/*==============================================================*/
/* Index: "Tipizacija regiona_FK"                               */
/*==============================================================*/




create nonclustered index "Tipizacija regiona_FK" on Region ("Tip regiona" ASC)
go

/*==============================================================*/
/* Index: "Maticna drava_FK"                                   */
/*==============================================================*/




create nonclustered index "Maticna drava_FK" on Region ("Pripada dravi" ASC)
go

/*==============================================================*/
/* Index: "Administrativno sjedište_FK"                         */
/*==============================================================*/




create nonclustered index "Administrativno sjedište_FK" on Region ("Drava sjedišta" ASC,
  "Administrativno sjedište" ASC)
go

/*==============================================================*/
/* Table: "Registar zaposlenih"                                 */
/*==============================================================*/
create table "Registar zaposlenih" (
   "Redni broj evidencije" int                  not null,
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Prezime              varchar(60)          not null,
   "Ime roditelja"      varchar(60)          null,
   Ime                  varchar(60)          not null,
   Pol                  char(1)              not null default ''
      constraint CKC_POL_REGISTAR check (Pol in ('M','','N')),
   "Maticni broj"       varchar(13)          null,
   constraint "PK_REGISTAR ZAPOSLENIH" primary key (Drzava, "Poslovni sistem", "Redni broj evidencije")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Registar zaposlenih"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Registar zaposlenih', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Registar zaposlenih', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: Zapošljava_FK                                         */
/*==============================================================*/




create nonclustered index Zapošljava_FK on "Registar zaposlenih" (Drzava ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Restrikcija atributa"                                */
/*==============================================================*/
create table "Restrikcija atributa" (
   Drzava               char(3)              not null,
   Pos_Identifikator    bigint               not null,
   "Poslovni sistem"    bigint               not null,
   Atribut              bigint               not null,
   Rola                 char(2)              not null,
   Dodavanje            bit                  not null,
   Izmjena              bit                  not null,
   Brisanje             bit                  not null,
   Pretraga             bit                  not null,
   constraint "PK_RESTRIKCIJA ATRIBUTA" primary key (Drzava, Pos_Identifikator, "Poslovni sistem", Atribut, Rola)
)
go

/*==============================================================*/
/* Index: "Restrikcija atributa2_FK"                            */
/*==============================================================*/




create nonclustered index "Restrikcija atributa2_FK" on "Restrikcija atributa" (Drzava ASC,
  Atribut ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Index: "Rola obuhvata akcije_FK"                             */
/*==============================================================*/




create nonclustered index "Rola obuhvata akcije_FK" on "Restrikcija atributa" (Drzava ASC,
  Atribut ASC,
  Rola ASC)
go

/*==============================================================*/
/* Table: "Restrikcija nad tabelama"                            */
/*==============================================================*/
create table "Restrikcija nad tabelama" (
   Tab_Dr_Oznaka       char(3)              not null,
   Pos_Identifikator    bigint               not null,
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Tabela               bigint               not null,
   Rola                 char(2)              not null,
   Dodavanje            bit                  not null,
   Brisanje             bit                  not null,
   Izmjena              bit                  not null,
   Pretraga             bit                  not null,
   constraint "PK_RESTRIKCIJA NAD TABELAMA" primary key (Tab_Dr_Oznaka, Pos_Identifikator, Tabela, Drzava, "Poslovni sistem", Rola)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Restrikcija nad tabelama"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Restrikcija nad tabelama', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Restrikcija nad tabelama', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Rola obuhvata tabele_FK"                             */
/*==============================================================*/




create nonclustered index "Rola obuhvata tabele_FK" on "Restrikcija nad tabelama" (Drzava ASC,
  "Poslovni sistem" ASC,
  Rola ASC)
go

/*==============================================================*/
/* Index: "Restrikcija nad tabelama2_FK"                        */
/*==============================================================*/




create nonclustered index "Restrikcija nad tabelama2_FK" on "Restrikcija nad tabelama" (Drzava ASC,
  "Poslovni sistem" ASC,
  Tabela ASC)
go

/*==============================================================*/
/* Table: Rezervacija                                           */
/*==============================================================*/
create table Rezervacija (
   Oznaka               int                  not null,
   Klijent              varchar(30)          not null,
   Status               varchar(20)          not null,
   "Vrijeme kreiranja"  datetime             null,
   Od                   datetime             null,
   Do                   datetime             null,
   "Open date"          bit                  null,
   "Nacin placanja"     varchar(30)          null,
   Placena              bit                  null,
   "One way"            bit                  null,
   "Ukupna cijena"      numeric(15,2)        null,
   constraint PK_REZERVACIJA primary key (Klijent, Oznaka)
)
go

/*==============================================================*/
/* Index: stanje_FK                                             */
/*==============================================================*/




create nonclustered index stanje_FK on Rezervacija (Status ASC)
go

/*==============================================================*/
/* Index: rezervise_FK                                          */
/*==============================================================*/




create nonclustered index rezervise_FK on Rezervacija (Klijent ASC)
go

/*==============================================================*/
/* Table: Rola                                                  */
/*==============================================================*/
create table Rola (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Oznaka role"        char(2)              not null,
   Prioritet            smallint             not null,
   "Naziv role"         varchar(80)          not null,
   Opis                 varchar(1000)        null,
   constraint PK_ROLA primary key (Drzava, "Poslovni sistem", "Oznaka role")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Rola')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Rola', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Rola', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Role poslovnog sistema_FK"                           */
/*==============================================================*/




create nonclustered index "Role poslovnog sistema_FK" on Rola (Drzava ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Sadri atribute"                                     */
/*==============================================================*/
create table "Sadri atribute" (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Pos_Identifikator    bigint               not null,
   Tabela               bigint               not null,
   Atribut              bigint               not null,
   constraint "PK_SADRI ATRIBUTE" primary key (Drzava, "Poslovni sistem", Atribut, Dr_Oznaka, Pos_Identifikator, Tabela)
)
go

/*==============================================================*/
/* Index: "Pripadaju tabeli_FK"                                 */
/*==============================================================*/




create nonclustered index "Pripadaju tabeli_FK" on "Sadri atribute" (Drzava ASC,
  "Poslovni sistem" ASC,
  Atribut ASC)
go

/*==============================================================*/
/* Index: "Sadri atribute2_FK"                                 */
/*==============================================================*/




create nonclustered index "Sadri atribute2_FK" on "Sadri atribute" (Drzava ASC,
  "Poslovni sistem" ASC,
  Tabela ASC)
go

/*==============================================================*/
/* Table: "Sadri podsisteme"                                   */
/*==============================================================*/
create table "Sadri podsisteme" (
   Sis_Dr_Oznaka       char(3)              not null,
   Sis_Pos_Identifikator bigint               not null,
   Sis_Identifikator    bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Pos_Identifikator    bigint               not null,
   Identifikator        bigint               not null,
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Sistem               bigint               not null,
   Podsistem            bigint               not null,
   constraint "PK_SADRI PODSISTEME" primary key (Sis_Dr_Oznaka, Sis_Pos_Identifikator, Sis_Identifikator, Dr_Oznaka, Pos_Identifikator, Identifikator, Sistem, Drzava, "Poslovni sistem", Podsistem)
)
go

/*==============================================================*/
/* Index: Sistem_FK                                             */
/*==============================================================*/




create nonclustered index Sistem_FK on "Sadri podsisteme" (Drzava ASC,
  "Poslovni sistem" ASC,
  Sistem ASC)
go

/*==============================================================*/
/* Index: Podsistem_FK                                          */
/*==============================================================*/




create nonclustered index Podsistem_FK on "Sadri podsisteme" (Drzava ASC,
  "Poslovni sistem" ASC,
  Podsistem ASC)
go

/*==============================================================*/
/* Table: "Sadri tabele"                                       */
/*==============================================================*/
create table "Sadri tabele" (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Pos_Identifikator    bigint               not null,
   Sistem               bigint               not null,
   Tabela               bigint               not null,
   constraint "PK_SADRI TABELE" primary key (Tabela, Dr_Oznaka, Pos_Identifikator, Drzava, "Poslovni sistem", Sistem)
)
go

/*==============================================================*/
/* Index: "Sadri tabele2_FK"                                   */
/*==============================================================*/




create nonclustered index "Sadri tabele2_FK" on "Sadri tabele" (Drzava ASC,
  "Poslovni sistem" ASC,
  Sistem ASC)
go

/*==============================================================*/
/* Index: "Pripadaju podsistemu_FK"                             */
/*==============================================================*/




create nonclustered index "Pripadaju podsistemu_FK" on "Sadri tabele" (Drzava ASC,
  "Poslovni sistem" ASC,
  Tabela ASC)
go

/*==============================================================*/
/* Table: "Sastav drava"                                       */
/*==============================================================*/
create table "Sastav drava" (
   "Sloena drava"     char(3)              not null,
   "Drava clanica"     char(3)              not null,
   "Redni broj"         numeric(2,0)         not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_SASTAV DRAVA" primary key ("Drava clanica", "Sloena drava", "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sastav drava"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Sloena drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sastav drava', 'column', 'Sloena drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sastav drava', 'column', 'Sloena drava'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sastav drava"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava clanica')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sastav drava', 'column', 'Drava clanica'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sastav drava', 'column', 'Drava clanica'
go

/*==============================================================*/
/* Index: "Sloena drava_FK"                                   */
/*==============================================================*/




create nonclustered index "Sloena drava_FK" on "Sastav drava" ("Sloena drava" ASC)
go

/*==============================================================*/
/* Index: "Drava clanica_FK"                                   */
/*==============================================================*/




create nonclustered index "Drava clanica_FK" on "Sastav drava" ("Drava clanica" ASC)
go

/*==============================================================*/
/* Table: "Sastav regiona"                                      */
/*==============================================================*/
create table "Sastav regiona" (
   "Tip sloenog regiona" char(1)              not null,
   "Sloeni region"     smallint             not null,
   "Tip clana"          char(1)              not null,
   "Region clan"        smallint             not null,
   constraint "PK_SASTAV REGIONA" primary key ("Tip sloenog regiona", "Sloeni region", "Tip clana", "Region clan")
)
go

/*==============================================================*/
/* Index: "Region u sastavu_FK"                                 */
/*==============================================================*/




create nonclustered index "Region u sastavu_FK" on "Sastav regiona" ("Tip clana" ASC,
  "Region clan" ASC)
go

/*==============================================================*/
/* Index: "Sastavljeni region_FK"                               */
/*==============================================================*/




create nonclustered index "Sastavljeni region_FK" on "Sastav regiona" ("Tip sloenog regiona" ASC,
  "Sloeni region" ASC)
go

/*==============================================================*/
/* Table: "Se nalazi"                                           */
/*==============================================================*/
create table "Se nalazi" (
   "Drzava skladistenja" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Organizaciona jedinica" numeric(4)           not null,
   "Drzava poslovnog sistema" char(3)              not null,
   Inv_ID               int                  not null,
   constraint "PK_SE NALAZI" primary key ("Drzava skladistenja", "Poslovni sistem", "Organizaciona jedinica", "Drzava poslovnog sistema", Inv_ID)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Se nalazi"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava skladistenja')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Se nalazi', 'column', 'Drzava skladistenja'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Se nalazi', 'column', 'Drzava skladistenja'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Se nalazi"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava poslovnog sistema')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Se nalazi', 'column', 'Drzava poslovnog sistema'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Se nalazi', 'column', 'Drzava poslovnog sistema'
go

/*==============================================================*/
/* Index: "se nalazi_FK"                                        */
/*==============================================================*/




create nonclustered index "se nalazi_FK" on "Se nalazi" (Inv_ID ASC)
go

/*==============================================================*/
/* Index: Relationship_6_FK                                     */
/*==============================================================*/




create nonclustered index Relationship_6_FK on "Se nalazi" ("Drzava skladistenja" ASC,
  "Poslovni sistem" ASC,
  "Organizaciona jedinica" ASC,
  "Drzava poslovnog sistema" ASC)
go

/*==============================================================*/
/* Table: "Sistem ili podsistem"                                */
/*==============================================================*/
create table "Sistem ili podsistem" (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Identifikator        bigint               not null,
   Naziv                varchar(120)         not null,
   Kod                  varchar(30)          not null,
   constraint "PK_SISTEM ILI PODSISTEM" primary key (Drzava, "Poslovni sistem", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sistem ili podsistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sistem ili podsistem', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sistem ili podsistem', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Resursi poslovnog sistema3_FK"                       */
/*==============================================================*/




create nonclustered index "Resursi poslovnog sistema3_FK" on "Sistem ili podsistem" (Drzava ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Sloena organizaciona jedinica"                      */
/*==============================================================*/
create table "Sloena organizaciona jedinica" (
   "Drzava poslovnog sistema" char(3)              not null,
   "Poslovni sistem"    bigint               null,
   Drzava               char(3)              null,
   "Sloena jedinica"   numeric(4)           not null,
   Org_Drzava           char(3)              not null,
   "Jedinica u sastavu" numeric(4)           not null,
   constraint "PK_SLOENA ORGANIZACIONA JEDIN" primary key (Org_Drzava, "Sloena jedinica", "Drzava poslovnog sistema", "Jedinica u sastavu")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloena organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava poslovnog sistema')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Drzava poslovnog sistema'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Drzava poslovnog sistema'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloena organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Drzava'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloena organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Org_Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Org_Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Org_Drzava'
go

/*==============================================================*/
/* Index: "Organizaciona jedinica u sastavu_FK"                 */
/*==============================================================*/




create nonclustered index "Organizaciona jedinica u sastavu_FK" on "Sloena organizaciona jedinica" (Org_Drzava ASC,
  "Poslovni sistem" ASC,
  "Jedinica u sastavu" ASC,
  "Drzava poslovnog sistema" ASC)
go

/*==============================================================*/
/* Index: "Maticna organizaciona jedinica_FK"                   */
/*==============================================================*/




create nonclustered index "Maticna organizaciona jedinica_FK" on "Sloena organizaciona jedinica" (Drzava ASC,
  "Poslovni sistem" ASC,
  "Sloena jedinica" ASC,
  "Drzava poslovnog sistema" ASC)
go

/*==============================================================*/
/* Table: "Sloeni poslovni sistem"                             */
/*==============================================================*/
create table "Sloeni poslovni sistem" (
   Pos_Drzava           char(3)              not null,
   "Maticni poslovni sistem" bigint               not null,
   Drzava               char(3)              not null,
   "Poslovni sistem clanica" bigint               not null,
   "Redni broj"         numeric(1)           not null,
   "Tip sloenog poslovnog sistema" char(1)              not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_SLOENI POSLOVNI SISTEM" primary key (Pos_Drzava, "Maticni poslovni sistem", Drzava, "Poslovni sistem clanica", "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloeni poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Pos_Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Pos_Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Pos_Drzava'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloeni poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Maticni poslovni sistem_FK"                          */
/*==============================================================*/




create nonclustered index "Maticni poslovni sistem_FK" on "Sloeni poslovni sistem" (Pos_Drzava ASC,
  "Maticni poslovni sistem" ASC)
go

/*==============================================================*/
/* Index: "Sistem u sastavu_FK"                                 */
/*==============================================================*/




create nonclustered index "Sistem u sastavu_FK" on "Sloeni poslovni sistem" (Drzava ASC,
  "Poslovni sistem clanica" ASC)
go

/*==============================================================*/
/* Index: "Tipizacija sloenog poslovnog sistema_FK"            */
/*==============================================================*/




create nonclustered index "Tipizacija sloenog poslovnog sistema_FK" on "Sloeni poslovni sistem" ("Tip sloenog poslovnog sistema" ASC)
go

/*==============================================================*/
/* Table: "Status razmjene"                                     */
/*==============================================================*/
create table "Status razmjene" (
   Oznaka               varchar(20)          not null,
   Naziv                varchar(100)         not null,
   Opis                 varchar(200)         null,
   constraint "PK_STATUS RAZMJENE" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Status rezervacije"                                  */
/*==============================================================*/
create table "Status rezervacije" (
   Oznaka               varchar(20)          not null,
   Naziv                varchar(100)         not null,
   Opis                 varchar(200)         null,
   constraint "PK_STATUS REZERVACIJE" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Status vozila"                                       */
/*==============================================================*/
create table "Status vozila" (
   Oznaka               varchar(25)          not null,
   Naziv                varchar(200)         not null,
   Opis                 varchar(200)         null,
   constraint "PK_STATUS VOZILA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: Steta                                                 */
/*==============================================================*/
create table Steta (
   "Broj vozila"        varchar(20)          not null,
   "Servis za popravku" bigint               not null,
   Oznaka               varchar(20)          not null,
   "Vrijeme ostecenja"  datetime             not null,
   "Vrijeme predaje"    datetime             null,
   "Vrijeme popravke"   datetime             null,
   Tip                  varchar(30)          null,
   Opis                 varchar(120)         null,
   "Dio vozila"         image                null,
   constraint PK_STETA primary key ("Broj vozila", "Servis za popravku", Oznaka)
)
go

/*==============================================================*/
/* Index: "je osteceno_FK"                                      */
/*==============================================================*/




create nonclustered index "je osteceno_FK" on Steta ("Broj vozila" ASC)
go

/*==============================================================*/
/* Index: "je popravljena_FK"                                   */
/*==============================================================*/




create nonclustered index "je popravljena_FK" on Steta ("Servis za popravku" ASC)
go

/*==============================================================*/
/* Table: "Struktura atributa"                                  */
/*==============================================================*/
create table "Struktura atributa" (
   Atr_Dr_Oznaka       char(3)              not null,
   Atr_Pos_Identifikator bigint               not null,
   Atr_Identifikator    bigint               not null,
   Dr_Oznaka           char(3)              not null,
   Pos_Identifikator    bigint               not null,
   Identifikator        bigint               not null,
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Atribut              bigint               not null,
   "Sadrani atribut"   bigint               not null,
   constraint "PK_STRUKTURA ATRIBUTA" primary key (Atr_Dr_Oznaka, Atr_Pos_Identifikator, Atr_Identifikator, Dr_Oznaka, Pos_Identifikator, Identifikator, "Sadrani atribut", Drzava, "Poslovni sistem", Atribut)
)
go

/*==============================================================*/
/* Index: "Sadrani atribut_FK"                                 */
/*==============================================================*/




create nonclustered index "Sadrani atribut_FK" on "Struktura atributa" (Drzava ASC,
  "Poslovni sistem" ASC,
  "Sadrani atribut" ASC)
go

/*==============================================================*/
/* Index: Atribut_FK                                            */
/*==============================================================*/




create nonclustered index Atribut_FK on "Struktura atributa" (Drzava ASC,
  "Poslovni sistem" ASC,
  Atribut ASC)
go

/*==============================================================*/
/* Table: Tabela                                                */
/*==============================================================*/
create table Tabela (
   Drzava               char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Identifikator        bigint               not null,
   Naziv                varchar(120)         not null,
   Kod                  varchar(30)          not null,
   constraint PK_TABELA primary key (Drzava, "Poslovni sistem", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Tabela')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Tabela', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Tabela', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: "Resursi poslovnog sistema_FK"                        */
/*==============================================================*/




create nonclustered index "Resursi poslovnog sistema_FK" on Tabela (Drzava ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: Tip                                                   */
/*==============================================================*/
create table Tip (
   Oznaka               int                  not null,
   Naziv                varchar(25)          not null,
   Opis                 varchar(150)         null,
   constraint PK_TIP primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip klijenta"                                        */
/*==============================================================*/
create table "Tip klijenta" (
   Oznaka               varchar(20)          not null,
   Naziv                varchar(100)         not null,
   Opis                 varchar(200)         null,
   constraint "PK_TIP KLIJENTA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip motornog vozila"                                 */
/*==============================================================*/
create table "Tip motornog vozila" (
   Oznaka               varchar(25)          not null,
   Naziv                varchar(200)         not null,
   Opis                 varchar(200)         null,
   constraint "PK_TIP MOTORNOG VOZILA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip nabavke"                                         */
/*==============================================================*/
create table "Tip nabavke" (
   Oznaka               varchar(25)          not null,
   Naziv                varchar(30)          not null,
   Opis                 varchar(120)         null,
   constraint "PK_TIP NABAVKE" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip organizacione jedinice"                          */
/*==============================================================*/
create table "Tip organizacione jedinice" (
   Oznaka               char(1)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_TIP ORGANIZACIONE JEDINICE" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip plovnog vozila"                                  */
/*==============================================================*/
create table "Tip plovnog vozila" (
   Oznaka               varchar(25)          not null,
   Naziv                varchar(30)          not null,
   Opis                 varchar(120)         null,
   constraint "PK_TIP PLOVNOG VOZILA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip poslovnog sistema"                               */
/*==============================================================*/
create table "Tip poslovnog sistema" (
   Oznaka               char(1)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_TIP POSLOVNOG SISTEMA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip prikolice"                                       */
/*==============================================================*/
create table "Tip prikolice" (
   Oznaka               varchar(20)          not null,
   Naziv                varchar(200)         not null,
   Opis                 varchar(200)         null,
   constraint "PK_TIP PRIKOLICE" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip regiona"                                         */
/*==============================================================*/
create table "Tip regiona" (
   Oznaka               char(1)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(265)         null,
   constraint "PK_TIP REGIONA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip sektora"                                         */
/*==============================================================*/
create table "Tip sektora" (
   Oznaka               numeric(4)           not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_TIP SEKTORA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip sloenog poslovnog sistema"                      */
/*==============================================================*/
create table "Tip sloenog poslovnog sistema" (
   Oznaka               char(1)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_TIP SLOENOG POSLOVNOG SIST" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Tip trajnog resursa"                                 */
/*==============================================================*/
create table "Tip trajnog resursa" (
   Oznaka               int                  not null,
   Naziv                varchar(25)          not null,
   Opis                 varchar(100)         null,
   constraint "PK_TIP TRAJNOG RESURSA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Trajni materijalni resurs"                           */
/*==============================================================*/
create table "Trajni materijalni resurs" (
   Oznaka               int                  not null,
   Naziv                varchar(25)          not null,
   Tip                  int                  not null,
   Opis                 varchar(100)         null,
   "Datum nabavke"      datetime             null,
   constraint "PK_TRAJNI MATERIJALNI RESURS" primary key (Oznaka)
)
go

/*==============================================================*/
/* Index: "Tipizacija materijalnog resursa_FK"                  */
/*==============================================================*/




create nonclustered index "Tipizacija materijalnog resursa_FK" on "Trajni materijalni resurs" (Tip ASC)
go

/*==============================================================*/
/* Table: "Ugovor o nabavci"                                    */
/*==============================================================*/
create table "Ugovor o nabavci" (
   "Drzava potpisnika"  char(3)              not null,
   "Agencija potpisnika" bigint               not null,
   "Broj evidencije potpisnika" int                  not null,
   "Drzava davaoca"     char(3)              not null,
   "Broj davaoca"       bigint               not null,
   "Drzava narucioca"   char(3)              not null,
   "Broj narucioca"     bigint               not null,
   "Broj ugovora"       varchar(30)          not null,
   "Tip ugovora"        varchar(25)          not null,
   Datum                datetime             null,
   Rata                 decimal(15,2)        null,
   constraint "PK_UGOVOR O NABAVCI" primary key ("Drzava potpisnika", "Agencija potpisnika", "Broj evidencije potpisnika", "Drzava davaoca", "Broj davaoca", "Drzava narucioca", "Broj narucioca", "Broj ugovora")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Ugovor o nabavci"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava potpisnika')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Ugovor o nabavci', 'column', 'Drzava potpisnika'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Ugovor o nabavci', 'column', 'Drzava potpisnika'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Ugovor o nabavci"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava davaoca')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Ugovor o nabavci', 'column', 'Drzava davaoca'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Ugovor o nabavci', 'column', 'Drzava davaoca'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Ugovor o nabavci"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava narucioca')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Ugovor o nabavci', 'column', 'Drzava narucioca'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Ugovor o nabavci', 'column', 'Drzava narucioca'
go

/*==============================================================*/
/* Index: davalac_FK                                            */
/*==============================================================*/




create nonclustered index davalac_FK on "Ugovor o nabavci" ("Drzava davaoca" ASC,
  "Broj davaoca" ASC)
go

/*==============================================================*/
/* Index: narucioc_FK                                           */
/*==============================================================*/




create nonclustered index narucioc_FK on "Ugovor o nabavci" ("Drzava narucioca" ASC,
  "Broj narucioca" ASC)
go

/*==============================================================*/
/* Index: potpisnik_FK                                          */
/*==============================================================*/




create nonclustered index potpisnik_FK on "Ugovor o nabavci" ("Drzava potpisnika" ASC,
  "Agencija potpisnika" ASC,
  "Broj evidencije potpisnika" ASC)
go

/*==============================================================*/
/* Index: "vrsta nabavake_FK"                                   */
/*==============================================================*/




create nonclustered index "vrsta nabavake_FK" on "Ugovor o nabavci" ("Tip ugovora" ASC)
go

/*==============================================================*/
/* Table: "Ugovor rezervacije"                                  */
/*==============================================================*/
create table "Ugovor rezervacije" (
   Potpisnik            varchar(30)          not null,
   Rezervant            varchar(30)          not null,
   "Broj rezervacije"   int                  not null,
   Drzava               char(3)              not null,
   "Agencija za iznajmljivanje" bigint               not null,
   Oznaka               varchar(30)          not null,
   "Ime i prezime vozaca" varchar(150)         null,
   "Vozacka dozvola"    varchar(30)          null,
   constraint "PK_UGOVOR REZERVACIJE" primary key (Potpisnik, Rezervant, "Broj rezervacije", Drzava, "Agencija za iznajmljivanje", Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Ugovor rezervacije"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Ugovor rezervacije', 'column', 'Drzava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Ugovor rezervacije', 'column', 'Drzava'
go

/*==============================================================*/
/* Index: sa_FK                                                 */
/*==============================================================*/




create nonclustered index sa_FK on "Ugovor rezervacije" (Potpisnik ASC)
go

/*==============================================================*/
/* Index: "je ugovorena_FK"                                     */
/*==============================================================*/




create nonclustered index "je ugovorena_FK" on "Ugovor rezervacije" (Rezervant ASC,
  "Broj rezervacije" ASC)
go

/*==============================================================*/
/* Index: sklapa_FK                                             */
/*==============================================================*/




create nonclustered index sklapa_FK on "Ugovor rezervacije" (Drzava ASC,
  "Agencija za iznajmljivanje" ASC)
go

/*==============================================================*/
/* Table: Vozilo                                                */
/*==============================================================*/
create table Vozilo (
   "Broj vozila"        varchar(20)          not null,
   Status               varchar(25)          not null,
   "Broj ugovora"       varchar(30)          null,
   Cijena               varchar(20)          not null,
   Lokacija             numeric(4)           null,
   "Drzava lokacije"    char(3)              null,
   Agencija             bigint               null,
   "Drzava agencije"    char(3)              null,
   "Broj osiguranja"    bigint               null,
   "Broj resursa"       int                  null,
   Depozit              decimal(15,2)        null,
   "Datum isteka osiguranja" datetime             null,
   Slika                image                null,
   constraint PK_VOZILO primary key ("Broj vozila")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Vozilo')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava lokacije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Vozilo', 'column', 'Drzava lokacije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Vozilo', 'column', 'Drzava lokacije'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Vozilo')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drzava agencije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Vozilo', 'column', 'Drzava agencije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Vozilo', 'column', 'Drzava agencije'
go

/*==============================================================*/
/* Index: "Je nabavljeno po_FK"                                 */
/*==============================================================*/




create nonclustered index "Je nabavljeno po_FK" on Vozilo ("Broj ugovora" ASC)
go

/*==============================================================*/
/* Index: Relationship_27_FK                                    */
/*==============================================================*/




create nonclustered index Relationship_27_FK on Vozilo ("Broj resursa" ASC)
go

/*==============================================================*/
/* Index: osigurava_FK                                          */
/*==============================================================*/




create nonclustered index osigurava_FK on Vozilo ("Broj osiguranja" ASC)
go

/*==============================================================*/
/* Index: "Stanje vozila_FK"                                    */
/*==============================================================*/




create nonclustered index "Stanje vozila_FK" on Vozilo (Status ASC)
go

/*==============================================================*/
/* Index: kosta_FK                                              */
/*==============================================================*/




create nonclustered index kosta_FK on Vozilo (Cijena ASC)
go

/*==============================================================*/
/* Index: "trenutna lokacija_FK"                                */
/*==============================================================*/




create nonclustered index "trenutna lokacija_FK" on Vozilo ("Drzava lokacije" ASC,
  Agencija ASC,
  Lokacija ASC,
  "Drzava agencije" ASC)
go

/*==============================================================*/
/* Table: "Vozilo drumskog saobracaja"                          */
/*==============================================================*/
create table "Vozilo drumskog saobracaja" (
   "Broj vozila"        varchar(20)          not null,
   "Broj sasije"        varchar(30)          not null,
   Tip                  varchar(25)          not null,
   Klasa                varchar(25)          not null,
   Marka                varchar(30)          null,
   Model                varchar(30)          null,
   Boja                 varchar(20)          null,
   Manuelni             bit                  null,
   "Broj vrata"         numeric(2,0)         null,
   "Broj sjedista"      numeric(2,0)         null,
   "Stanje rezervoara"  float                null,
   Kilometraza          bigint               null,
   "Registarski broj"   varchar(10)          null,
   "Broj saobracajne"   varchar(13)          null,
   "Broj motora"        varchar(30)          null,
   "Zapremina motora"   float                null,
   "Snaga u kW"         float                null,
   Masa                 float                null,
   "Ukupna nosivost"    float                null,
   "Zapremina rezervoara" float                null,
   constraint "PK_VOZILO DRUMSKOG SAOBRACAJA" primary key ("Broj vozila", "Broj sasije")
)
go

/*==============================================================*/
/* Index: "Moze biti4_FK"                                       */
/*==============================================================*/




create nonclustered index "Moze biti4_FK" on "Vozilo drumskog saobracaja" (Tip ASC)
go

/*==============================================================*/
/* Index: "Moze biti_FK"                                        */
/*==============================================================*/




create nonclustered index "Moze biti_FK" on "Vozilo drumskog saobracaja" ("Broj vozila" ASC)
go

/*==============================================================*/
/* Index: "Pripada klasi_FK"                                    */
/*==============================================================*/




create nonclustered index "Pripada klasi_FK" on "Vozilo drumskog saobracaja" (Klasa ASC)
go

/*==============================================================*/
/* Table: "Vrsta radnog odnosa"                                 */
/*==============================================================*/
create table "Vrsta radnog odnosa" (
   Oznaka               char(2)              not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_VRSTA RADNOG ODNOSA" primary key (Oznaka)
)
go

/*==============================================================*/
/* Table: "Školska sprema"                                      */
/*==============================================================*/
create table "Školska sprema" (
   Oznaka               char(2)              not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   Naziv                varchar(120)         not null,
   Opis                 varchar(256)         null,
   constraint "PK_ŠKOLSKA SPREMA" primary key (Stepen, "Nivo obrazovanja", Oznaka)
)
go

/*==============================================================*/
/* Index: "Koje školske spreme_FK"                              */
/*==============================================================*/




create nonclustered index "Koje školske spreme_FK" on "Školska sprema" (Stepen ASC,
  "Nivo obrazovanja" ASC)
go

alter table "Adresni podaci"
   add constraint "FK_ADRESNI _KOD DRUGO_POSLOVNI" foreign key ("Drava poslodavca", Poslodavac)
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Adresni podaci"
   add constraint "FK_ADRESNI _KONTAKT P_REGISTAR" foreign key (Drzava, Identifikator, Zaposleni)
      references "Registar zaposlenih" (Drzava, "Poslovni sistem", "Redni broj evidencije")
go

alter table "Adresni podaci"
   add constraint "FK_ADRESNI _MJESTO AD_NASELJEN" foreign key (Drava, Mjesto)
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table Atribut
   add constraint "FK_ATRIBUT_RESURSI P_POSLOVNI" foreign key (Drzava, "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table Drava
   add constraint "FK_DRAVA_AKTUELNI _NASELJEN" foreign key (Oznaka, "Glavni grad")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table Drava
   add constraint "FK_DRAVA_TEKUCE UR_DRAVNO" foreign key ("Dravno uredenje")
      references "Dravno uredenje" (Oznaka)
go

alter table Dravljanstvo
   add constraint FK_DRAVLJA_DRAVLJAN_REGISTAR foreign key (Drzava, Identifikator, Zaposleni)
      references "Registar zaposlenih" (Drzava, "Poslovni sistem", "Redni broj evidencije")
go

alter table Dravljanstvo
   add constraint FK_DRAVLJA_DRAVLJAN_DRAVA foreign key (Dravljanstvo)
      references Drava (Oznaka)
go

alter table "Glavni grad"
   add constraint "FK_GLAVNI G_GLAVNI GR_DRAVA" foreign key (Dr_Oznaka2)
      references Drava (Oznaka)
go

alter table "Glavni grad"
   add constraint "FK_GLAVNI G_GLAVNI GR_NASELJEN" foreign key (Dr_Oznaka2, "Glavni grad")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table Inventar
   add constraint FK_INVENTAR_PRIPADA3_POSLOVNI foreign key ("Drzava poslovnog sistema", "Identifikator poslovnog sistema")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table Inventar
   add constraint FK_INVENTAR_TIPIZACIJ_TIP foreign key ("Oznaka tipa")
      references Tip (Oznaka)
go

alter table "Istorija uredenja"
   add constraint "FK_ISTORIJA_KROZ ISTO_DRAVA" foreign key (Drava)
      references Drava (Oznaka)
go

alter table "Istorija uredenja"
   add constraint "FK_ISTORIJA_UREĞENJE _DRAVNO" foreign key ("Dravno uredenje")
      references "Dravno uredenje" (Oznaka)
go

alter table "Izabrani tipovi organizacione jedinice"
   add constraint "FK_IZABRANI_IZABRANA _TIP ORGA" foreign key ("Tip organizacione jedinice")
      references "Tip organizacione jedinice" (Oznaka)
go

alter table "Izabrani tipovi organizacione jedinice"
   add constraint "FK_IZABRANI_IZBOR TIP_POSLOVNI" foreign key (Drzava, "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Iznajmljena vozila"
   add constraint "FK_IZNAJMLJ_JE IZNAJM_VOZILO" foreign key ("Broj vozila")
      references Vozilo ("Broj vozila")
go

alter table "Iznajmljena vozila"
   add constraint "FK_IZNAJMLJ_JE REZERV_REZERVAC" foreign key ("Klijent rezervisao", Rezervacija)
      references Rezervacija (Klijent, Oznaka)
go

alter table "Iznajmljena vozila"
   add constraint "FK_IZNAJMLJ_PREDAO VO_REGISTAR" foreign key (Drzava, "Agencija predajnika", "Broj predajnika")
      references "Registar zaposlenih" (Drzava, "Poslovni sistem", "Redni broj evidencije")
go

alter table "Iznajmljena vozila"
   add constraint "FK_IZNAJMLJ_PREUZIMA _KLIJENT" foreign key ("Klijent vratio")
      references Klijent (Identifikator)
go

alter table "Iznajmljena vozila"
   add constraint "FK_IZNAJMLJ_PRIJEM VO_REGISTAR" foreign key (Drzava, "Agencija prijemnika", "Broj prijemnika")
      references "Registar zaposlenih" (Drzava, "Poslovni sistem", "Redni broj evidencije")
go

alter table "Iznajmljena vozila"
   add constraint "FK_IZNAJMLJ_VRACA IZN_KLIJENT" foreign key ("Klijent preuzeo")
      references Klijent (Identifikator)
go

alter table "Katalog radnih mjesta"
   add constraint "FK_KATALOG _IMA RADNA_POSLOVNI" foreign key (Drzava, "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Katalog zanimanja"
   add constraint "FK_KATALOG _REGISTROV_DRAVA" foreign key (Drava)
      references Drava (Oznaka)
go

alter table "Katalog zvanja"
   add constraint "FK_KATALOG _KATALOG Z_DRAVA" foreign key (Dr_Oznaka)
      references Drava (Oznaka)
go

alter table Klijent
   add constraint "FK_KLIJENT_VRSTA LIC_TIP KLIJ" foreign key (Tip)
      references "Tip klijenta" (Oznaka)
go

alter table "Korisnicki nalog"
   add constraint "FK_KORISNIC_NALOG ZAP_REGISTAR" foreign key (Drzava, "Poslovni sistem", Zaposleni)
      references "Registar zaposlenih" (Drzava, "Poslovni sistem", "Redni broj evidencije")
go

alter table "Korisnicki nalog"
   add constraint FK_KORISNIC_REGISTROV_POSLOVNI foreign key (Drzava, "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Lista zvanja"
   add constraint "FK_LISTA ZV_LISTA ZVA_KATALOG" foreign key (Dr_Oznaka, Zvanje)
      references "Katalog zvanja" (Dr_Oznaka, Oznaka)
go

alter table "Lista zvanja"
   add constraint "FK_LISTA ZV_OBUHVATA _ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", "Školska sprema")
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Mjesna zajednica"
   add constraint "FK_MJESNA Z_IMA MJESN_OPŠTINA" foreign key (Dr_Oznaka, "Oznaka opštine")
      references Opština (Oznaka, "Oznaka opštine")
go

alter table "Mjesna zajednica"
   add constraint "FK_MJESNA Z_SJEDIŠTE _NASELJEN" foreign key (Dr_Oznaka, "Mjesna kancelarija")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Mjesno pokrivanje naselja"
   add constraint "FK_MJESNO P_MJESNA ZA_MJESNA Z" foreign key ("Oznaka opštine", "Mjesna zajednica")
      references "Mjesna zajednica" ("Oznaka opštine", Identifikator)
go

alter table "Mjesno pokrivanje naselja"
   add constraint "FK_MJESNO P_PRIPADA M_NASELJEN" foreign key (Dr_Oznaka, "Naseljeno mjesto")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Naseljeno mjesto"
   add constraint "FK_NASELJEN_SADRI NA_DRAVA" foreign key (Drava)
      references Drava (Oznaka)
go

alter table "Obrazuju za"
   add constraint "FK_OBRAZUJU_OBRAZUJU _POSLOVNI" foreign key (Drzava, "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Obrazuju za"
   add constraint "FK_OBRAZUJU_ŠKOLSKE S_ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", "Školska sprema")
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Obuhvata naselja"
   add constraint "FK_OBUHVATA_OBUHVATA _REGION" foreign key (Oznaka, "Oznaka regiona")
      references Region ("Tip regiona", "Oznaka regiona")
go

alter table "Obuhvata naselja"
   add constraint "FK_OBUHVATA_PRIPADA R_NASELJEN" foreign key (Drava, "Naseljeno mjesto")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Obuhvata opštine"
   add constraint "FK_OBUHVATA_OPŠTINA O_OPŠTINA" foreign key (Dr_Oznaka, "Oznaka opštine")
      references Opština (Oznaka, "Oznaka opštine")
go

alter table "Obuhvata opštine"
   add constraint "FK_OBUHVATA_OBUHVATA _NASELJEN2" foreign key (Dr_Oznaka, "Naseljeno mjesto")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table Odrzavanje
   add constraint FK_ODRZAVAN_ODRZAVA_POSLOVNI foreign key ("Servis za odrzavanje", "Servis za odrzavanje")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table Odrzavanje
   add constraint "FK_ODRZAVAN_SE ODRZAV_VOZILO" foreign key ("Broj vozila")
      references Vozilo ("Broj vozila")
go

alter table Odsjek
   add constraint "FK_ODSJEK_TIPIZACIJ_TIP SEKT" foreign key (Tip)
      references "Tip sektora" (Oznaka)
go

alter table Opština
   add constraint "FK_OPŠTINA_LOKALNA S_DRAVA" foreign key (Oznaka)
      references Drava (Oznaka)
go

alter table Opština
   add constraint "FK_OPŠTINA_SJEDIŠTE _NASELJEN" foreign key (Oznaka, "Sjedište opštine")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Organizacija trajnih resursa"
   add constraint FK_ORGANIZA_PRIPADNOS_ORGANIZA foreign key ("Drzava poslovnice", "Poslovni sistem", "Organizaciona jedinica", "Drzava poslovnice")
      references "Organizaciona jedinica" (Drzava, "Poslovni sistem", Oznaka, "Drzava poslovnog sistema")
go

alter table "Organizacija trajnih resursa"
   add constraint "FK_ORGANIZA_RESURS DO_TRAJNI M" foreign key (Oznaka)
      references "Trajni materijalni resurs" (Oznaka)
go

alter table "Organizaciona jedinica"
   add constraint "FK_ORGANIZA_SJEDIŠTE _NASELJEN" foreign key ("Drzava poslovnog sistema", "Sjedište organizacione jedinice")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Organizaciona jedinica"
   add constraint FK_ORGANIZA_TIPIZACIJ_IZABRANI foreign key ("Tip organizacione jedinice", "Drzava poslovnog sistema", "Poslovni sistem")
      references "Izabrani tipovi organizacione jedinice" ("Tip organizacione jedinice", Drzava, "Poslovni sistem")
go

alter table "Organizaciona jedinica"
   add constraint FK_ORGANIZA_UNUTRAŠNJ_POSLOVNI foreign key ("Drzava poslovnog sistema", "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Organizaciona sema"
   add constraint FK_ORGANIZA_IMA_POSLOVNI foreign key ("Drzava poslovnog sistema", "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Ostali materijalni resursi"
   add constraint "FK_OSTALI M_RELATIONS_TRAJNI M" foreign key ("Oznaka resursa")
      references "Trajni materijalni resurs" (Oznaka)
go

alter table "Personalna restrikcija"
   add constraint FK_PERSONAL_PERSONALN_PRIPADA foreign key (Drzava, "Poslovni sistem", Korisnik, Rola, Identifikator)
      references "Pripada roli" (Drzava, "Poslovni sistem", Korisnik, "Oznaka role", Identifikator)
go

alter table "Personalna restrikcija"
   add constraint FK_PERSONAL_PERSONALN_ATRIBUT foreign key (Drzava, "Poslovni sistem", Atribut)
      references Atribut (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Personalna restrikcija"
   add constraint FK_PERSONAL_PERSONALN_TABELA foreign key (Drzava, "Poslovni sistem", Tabela)
      references Tabela (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Plovno vozilo"
   add constraint "FK_PLOVNO V_MOZE BITI_VOZILO" foreign key ("Broj vozila")
      references Vozilo ("Broj vozila")
go

alter table "Plovno vozilo"
   add constraint "FK_PLOVNO V_VRSTA BRO_TIP PLOV" foreign key (Tip)
      references "Tip plovnog vozila" (Oznaka)
go

alter table "Plovno vozilo"
   add constraint "FK_PLOVNO V_VRSTA POG_POGON" foreign key (Pogon)
      references Pogon (Oznaka)
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_OBRAZOVNA_POSLOVNI" foreign key (Drzava, "Obrazovna ustanova")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_PODACI O _REGISTAR" foreign key (Kat_Dr_Oznaka, Reg_Identifikator, Zaposleni)
      references "Registar zaposlenih" (Drzava, "Poslovni sistem", "Redni broj evidencije")
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_TIPIZACIJ_KATALOG" foreign key (Kat_Dr_Oznaka, Zvanje)
      references "Katalog zvanja" (Dr_Oznaka, Oznaka)
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_TIPIZACIJ_ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", "Školska sprema")
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Poslovna hijerarhija"
   add constraint FK_POSLOVNA_HIJERARHI_ORGANIZA foreign key ("Drzava poslovnog sistema", "Poslovni sistem", "Organizaciona sema")
      references "Organizaciona sema" ("Drzava poslovnog sistema", "Poslovni sistem", "Redni broj")
go

alter table "Poslovna hijerarhija"
   add constraint FK_POSLOVNA_NADREDJEN_ODSJEK foreign key ("Nadredjeni odsjek")
      references Odsjek (Oznaka)
go

alter table "Poslovna hijerarhija"
   add constraint FK_POSLOVNA_NADREDJEN_KATALOG foreign key ("Drzava poslovnog sistema", "Poslovni sistem", "Nadredjeno radno mjesto")
      references "Katalog radnih mjesta" (Drzava, "Poslovni sistem", Oznaka)
go

alter table "Poslovna hijerarhija"
   add constraint FK_POSLOVNA_PODREDJEN_ODSJEK foreign key ("Podredjeni odsjek")
      references Odsjek (Oznaka)
go

alter table "Poslovna hijerarhija"
   add constraint FK_POSLOVNA_PODREDJEN_KATALOG foreign key ("Drzava poslovnog sistema", "Poslovni sistem", "Podredjeno radno mjesto")
      references "Katalog radnih mjesta" (Drzava, "Poslovni sistem", Oznaka)
go

alter table "Poslovna hijerarhija"
   add constraint "FK_POSLOVNA_U SKLOPU _ORGANIZA" foreign key ("Drzava poslovnog sistema", "Poslovni sistem", "Vazeca za jedinicu", "Drzava poslovnog sistema")
      references "Organizaciona jedinica" (Drzava, "Poslovni sistem", Oznaka, "Drzava poslovnog sistema")
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_DRAVA PO_DRAVA" foreign key (Drzava)
      references Drava (Oznaka)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_PRAVNI SL_POSLOVNI" foreign key ("Drzava pravnog sljedbenika", "Poslovni sistem sljedbenik")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_PRIPADA2_TRAJNI M" foreign key (Tra_Oznaka)
      references "Trajni materijalni resurs" (Oznaka)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_SJEDIŠTE _NASELJEN" foreign key (Drzava, "Sjedište poslovnog sistema")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_TIPIZACIJ_TIP POSL" foreign key ("Tip poslovnog sistema")
      references "Tip poslovnog sistema" (Oznaka)
go

alter table "Potrebna školska sprema"
   add constraint "FK_POTREBNA_POTREBNA _ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", "Školska sprema")
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Potrebna školska sprema"
   add constraint "FK_POTREBNA_ŠKOLSKA S_KATALOG" foreign key (Drzava, "Poslovni sistem", "Radno mjesto")
      references "Katalog radnih mjesta" (Drzava, "Poslovni sistem", Oznaka)
go

alter table "Potrebne spreme"
   add constraint "FK_POTREBNE_POTREBNE _ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", "Školska sprema")
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Potrebne spreme"
   add constraint "FK_POTREBNE_POTREBNE _KATALOG" foreign key (Drava, Zanimanje)
      references "Katalog zanimanja" (Drava, Zanimanje)
go

alter table "Povezana sa"
   add constraint "FK_POVEZANA_POVEZANA _TABELA" foreign key (Drzava, "Poslovni sistem", "Povezana tabela")
      references Tabela (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Povezana sa"
   add constraint FK_POVEZANA_TABELA_TABELA foreign key (Drzava, "Poslovni sistem", Tabela)
      references Tabela (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Pozicija u organizacionoj jedinici"
   add constraint "FK_POZICIJA_NA POZICI_KATALOG" foreign key ("Drzava poslovnog sistema", "Poslovni sistem", "Radno mjesto")
      references "Katalog radnih mjesta" (Drzava, "Poslovni sistem", Oznaka)
go

alter table "Pozicija u organizacionoj jedinici"
   add constraint "FK_POZICIJA_ZAPOSLEN _ORGANIZA" foreign key ("Drzava poslovnog sistema", "Poslovni sistem", "Organizaciona jedinica", "Drzava poslovnog sistema")
      references "Organizaciona jedinica" (Drzava, "Poslovni sistem", Oznaka, "Drzava poslovnog sistema")
go

alter table "Pravni nasljednik"
   add constraint "FK_PRAVNI N_DRAVA PR_DRAVA" foreign key (Nasljednica)
      references Drava (Oznaka)
go

alter table "Pravni nasljednik"
   add constraint "FK_PRAVNI N_NASLJEĞEN_DRAVA" foreign key (Nasljedena)
      references Drava (Oznaka)
go

alter table "Pravo na podsistem"
   add constraint "FK_PRAVO NA_ROLA OBUH_ROLA" foreign key (Drzava, "Poslovni sistem", Rola)
      references Rola (Drzava, "Poslovni sistem", "Oznaka role")
go

alter table "Pravo na podsistem"
   add constraint "FK_PRAVO NA_SISTEM PR_SISTEM I" foreign key (Drzava, "Poslovni sistem", Sistem)
      references "Sistem ili podsistem" (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Predefinisane role radnih mjesta"
   add constraint FK_PREDEFIN_PREDEFINI_KATALOG foreign key (Drzava, "Poslovni sistem", "Radno mjesto")
      references "Katalog radnih mjesta" (Drzava, "Poslovni sistem", Oznaka)
go

alter table "Predefinisane role radnih mjesta"
   add constraint "FK_PREDEFIN_ROLE ZA R_ROLA" foreign key (Drzava, "Poslovni sistem", "Oznaka role")
      references Rola (Drzava, "Poslovni sistem", "Oznaka role")
go

alter table Prikolica
   add constraint "FK_PRIKOLIC_MOZE BITI_VOZILO" foreign key ("Broj vozila")
      references Vozilo ("Broj vozila")
go

alter table Prikolica
   add constraint "FK_PRIKOLIC_TIPIZACIJ_TIP PRIK" foreign key (Tip)
      references "Tip prikolice" (Oznaka)
go

alter table "Pripada roli"
   add constraint "FK_PRIPADA _KO JE U G_ROLA" foreign key (Drzava, "Poslovni sistem", "Oznaka role")
      references Rola (Drzava, "Poslovni sistem", "Oznaka role")
go

alter table "Pripada roli"
   add constraint "FK_PRIPADA _SVRSTAN U_KORISNIC" foreign key (Drzava, "Poslovni sistem", Korisnik)
      references "Korisnicki nalog" (Drzava, "Poslovni sistem", "User ID")
go

alter table "Pripadnost odsjeku"
   add constraint FK_PRIPADNO_POZICIJA_ODSJEK foreign key (Odsjek)
      references Odsjek (Oznaka)
go

alter table "Pripadnost odsjeku"
   add constraint FK_PRIPADNO_PRIPADA_KATALOG foreign key ("Drzava poslovnog sistema", "Poslovni sistem", "Radno mjesto")
      references "Katalog radnih mjesta" (Drzava, "Poslovni sistem", Oznaka)
go

alter table "Pripadnost poslovnici"
   add constraint FK_PRIPADNO_POSLOVNIC_ORGANIZA foreign key (Drzava, "Poslovni sistem", Poslovnica, Drzava)
      references "Organizaciona jedinica" (Drzava, "Poslovni sistem", Oznaka, "Drzava poslovnog sistema")
go

alter table "Pripadnost poslovnici"
   add constraint FK_PRIPADNO_VOZILO_VOZILO foreign key ("Broj vozila")
      references Vozilo ("Broj vozila")
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_KADROVI U_ORGANIZA" foreign key (Drzava, Reg_Identifikator, "Organizaciona jedinica", "Drzava poslovnog sistema")
      references "Organizaciona jedinica" (Drzava, "Poslovni sistem", Oznaka, "Drzava poslovnog sistema")
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_RASPORED _KATALOG" foreign key ("Drzava poslovnog sistema", Reg_Identifikator, "Radno mjesto")
      references "Katalog radnih mjesta" (Drzava, "Poslovni sistem", Oznaka)
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_RASPORED _REGISTAR" foreign key ("Drzava poslovnog sistema", Reg_Identifikator, Zaposleni)
      references "Registar zaposlenih" (Drzava, "Poslovni sistem", "Redni broj evidencije")
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_TIPIZACIJ_VRSTA RA" foreign key ("Vrsta radnog odnosa")
      references "Vrsta radnog odnosa" (Oznaka)
go

alter table Razmjena
   add constraint "FK_RAZMJENA_STATUS_STATUS R" foreign key (Status)
      references "Status razmjene" (Oznaka)
go

alter table Razmjena
   add constraint FK_RAZMJENA_ZAKAZIVAN_IZNAJMLJ foreign key ("Iznajmljena vozila", "Broj vozila", "Klijent rezervisao", Rezervacija)
      references "Iznajmljena vozila" (Oznaka, "Broj vozila", "Klijent rezervisao", Rezervacija)
go

alter table Region
   add constraint FK_REGION_ADMINISTR_NASELJEN foreign key ("Drava sjedišta", "Administrativno sjedište")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table Region
   add constraint "FK_REGION_MATICNA D_DRAVA" foreign key ("Pripada dravi")
      references Drava (Oznaka)
go

alter table Region
   add constraint "FK_REGION_TIPIZACIJ_TIP REGI" foreign key ("Tip regiona")
      references "Tip regiona" (Oznaka)
go

alter table "Registar zaposlenih"
   add constraint FK_REGISTAR_ZAPOŠLJAV_POSLOVNI foreign key (Drzava, "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Restrikcija atributa"
   add constraint "FK_RESTRIKC_ATRIBUTI _ATRIBUT" foreign key (Drzava, Atribut, "Poslovni sistem")
      references Atribut (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Restrikcija atributa"
   add constraint "FK_RESTRIKC_ROLA OBUH_ROLA2" foreign key (Drzava, Atribut, Rola)
      references Rola (Drzava, "Poslovni sistem", "Oznaka role")
go

alter table "Restrikcija nad tabelama"
   add constraint "FK_RESTRIKC_ROLA OBUH_ROLA" foreign key (Drzava, "Poslovni sistem", Rola)
      references Rola (Drzava, "Poslovni sistem", "Oznaka role")
go

alter table "Restrikcija nad tabelama"
   add constraint "FK_RESTRIKC_TABELE PR_TABELA" foreign key (Drzava, "Poslovni sistem", Tabela)
      references Tabela (Drzava, "Poslovni sistem", Identifikator)
go

alter table Rezervacija
   add constraint FK_REZERVAC_REZERVISE_KLIJENT foreign key (Klijent)
      references Klijent (Identifikator)
go

alter table Rezervacija
   add constraint "FK_REZERVAC_STANJE_STATUS R" foreign key (Status)
      references "Status rezervacije" (Oznaka)
go

alter table Rola
   add constraint "FK_ROLA_ROLE POSL_POSLOVNI" foreign key (Drzava, "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Sadri atribute"
   add constraint "FK_SADRI A_PRIPADAJU_ATRIBUT" foreign key (Drzava, "Poslovni sistem", Atribut)
      references Atribut (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Sadri atribute"
   add constraint "FK_SADRI A_SADRI AT_TABELA" foreign key (Drzava, "Poslovni sistem", Tabela)
      references Tabela (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Sadri podsisteme"
   add constraint "FK_SADRI P_PODSISTEM_SISTEM I" foreign key (Drzava, "Poslovni sistem", Podsistem)
      references "Sistem ili podsistem" (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Sadri podsisteme"
   add constraint "FK_SADRI P_SISTEM_SISTEM I" foreign key (Drzava, "Poslovni sistem", Sistem)
      references "Sistem ili podsistem" (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Sadri tabele"
   add constraint "FK_SADRI T_PRIPADAJU_TABELA" foreign key (Drzava, "Poslovni sistem", Tabela)
      references Tabela (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Sadri tabele"
   add constraint "FK_SADRI T_SADRI TA_SISTEM I" foreign key (Drzava, "Poslovni sistem", Sistem)
      references "Sistem ili podsistem" (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Sastav drava"
   add constraint "FK_SASTAV D_DRAVA CL_DRAVA" foreign key ("Drava clanica")
      references Drava (Oznaka)
go

alter table "Sastav drava"
   add constraint "FK_SASTAV D_SLOENA D_DRAVA" foreign key ("Sloena drava")
      references Drava (Oznaka)
go

alter table "Sastav regiona"
   add constraint "FK_SASTAV R_REGION U _REGION" foreign key ("Tip clana", "Region clan")
      references Region ("Tip regiona", "Oznaka regiona")
go

alter table "Sastav regiona"
   add constraint "FK_SASTAV R_SASTAVLJE_REGION" foreign key ("Tip sloenog regiona", "Sloeni region")
      references Region ("Tip regiona", "Oznaka regiona")
go

alter table "Se nalazi"
   add constraint "FK_SE NALAZ_RELATIONS_ORGANIZA" foreign key ("Drzava skladistenja", "Poslovni sistem", "Organizaciona jedinica", "Drzava poslovnog sistema")
      references "Organizaciona jedinica" (Drzava, "Poslovni sistem", Oznaka, "Drzava poslovnog sistema")
go

alter table "Se nalazi"
   add constraint "FK_SE NALAZ_SE NALAZI_INVENTAR" foreign key (Inv_ID)
      references Inventar (ID)
go

alter table "Sistem ili podsistem"
   add constraint "FK_SISTEM I_RESURSI P_POSLOVNI" foreign key (Drzava, "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Sloena organizaciona jedinica"
   add constraint "FK_SLOENA _MATICNA O_ORGANIZA" foreign key (Drzava, "Poslovni sistem", "Sloena jedinica", "Drzava poslovnog sistema")
      references "Organizaciona jedinica" (Drzava, "Poslovni sistem", Oznaka, "Drzava poslovnog sistema")
go

alter table "Sloena organizaciona jedinica"
   add constraint "FK_SLOENA _ORGANIZAC_ORGANIZA" foreign key (Org_Drzava, "Poslovni sistem", "Jedinica u sastavu", "Drzava poslovnog sistema")
      references "Organizaciona jedinica" (Drzava, "Poslovni sistem", Oznaka, "Drzava poslovnog sistema")
go

alter table "Sloeni poslovni sistem"
   add constraint "FK_SLOENI _MATICNI P_POSLOVNI" foreign key (Pos_Drzava, "Maticni poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Sloeni poslovni sistem"
   add constraint "FK_SLOENI _SISTEM U _POSLOVNI" foreign key (Drzava, "Poslovni sistem clanica")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Sloeni poslovni sistem"
   add constraint "FK_SLOENI _TIPIZACIJ_TIP SLO" foreign key ("Tip sloenog poslovnog sistema")
      references "Tip sloenog poslovnog sistema" (Oznaka)
go

alter table Steta
   add constraint "FK_STETA_JE OSTECE_VOZILO" foreign key ("Broj vozila")
      references Vozilo ("Broj vozila")
go

alter table Steta
   add constraint "FK_STETA_JE POPRAV_POSLOVNI" foreign key ("Servis za popravku", "Servis za popravku")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Struktura atributa"
   add constraint FK_STRUKTUR_ATRIBUT_ATRIBUT foreign key (Drzava, "Poslovni sistem", Atribut)
      references Atribut (Drzava, "Poslovni sistem", Identifikator)
go

alter table "Struktura atributa"
   add constraint "FK_STRUKTUR_SADRANI _ATRIBUT" foreign key (Drzava, "Poslovni sistem", "Sadrani atribut")
      references Atribut (Drzava, "Poslovni sistem", Identifikator)
go

alter table Tabela
   add constraint "FK_TABELA_RESURSI P_POSLOVNI" foreign key (Drzava, "Poslovni sistem")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Trajni materijalni resurs"
   add constraint "FK_TRAJNI M_TIPIZACIJ_TIP TRAJ" foreign key (Tip)
      references "Tip trajnog resursa" (Oznaka)
go

alter table "Ugovor o nabavci"
   add constraint "FK_UGOVOR O_DAVALAC_POSLOVNI" foreign key ("Drzava davaoca", "Broj davaoca")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Ugovor o nabavci"
   add constraint "FK_UGOVOR O_NARUCIOC_POSLOVNI" foreign key ("Drzava narucioca", "Broj narucioca")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table "Ugovor o nabavci"
   add constraint "FK_UGOVOR O_POTPISNIK_REGISTAR" foreign key ("Drzava potpisnika", "Agencija potpisnika", "Broj evidencije potpisnika")
      references "Registar zaposlenih" (Drzava, "Poslovni sistem", "Redni broj evidencije")
go

alter table "Ugovor o nabavci"
   add constraint "FK_UGOVOR O_VRSTA NAB_TIP NABA" foreign key ("Tip ugovora")
      references "Tip nabavke" (Oznaka)
go

alter table "Ugovor rezervacije"
   add constraint "FK_UGOVOR R_JE UGOVOR_REZERVAC" foreign key (Rezervant, "Broj rezervacije")
      references Rezervacija (Klijent, Oznaka)
go

alter table "Ugovor rezervacije"
   add constraint "FK_UGOVOR R_SA_KLIJENT" foreign key (Potpisnik)
      references Klijent (Identifikator)
go

alter table "Ugovor rezervacije"
   add constraint "FK_UGOVOR R_SKLAPA_POSLOVNI" foreign key (Drzava, "Agencija za iznajmljivanje")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table Vozilo
   add constraint "FK_VOZILO_JE NABAVL_UGOVOR O" foreign key ("Broj ugovora", "Broj ugovora", "Broj ugovora", "Broj ugovora", "Broj ugovora", "Broj ugovora", "Broj ugovora", "Broj ugovora")
      references "Ugovor o nabavci" ("Drzava potpisnika", "Agencija potpisnika", "Broj evidencije potpisnika", "Drzava davaoca", "Broj davaoca", "Drzava narucioca", "Broj narucioca", "Broj ugovora")
go

alter table Vozilo
   add constraint "FK_VOZILO_RELATIONS_TRAJNI M" foreign key ("Broj resursa")
      references "Trajni materijalni resurs" (Oznaka)
go

alter table Vozilo
   add constraint "FK_VOZILO_STANJE VO_STATUS V" foreign key (Status)
      references "Status vozila" (Oznaka)
go

alter table Vozilo
   add constraint FK_VOZILO_KOSTA_CIJENA foreign key (Cijena)
      references Cijena ("Id cijene")
go

alter table Vozilo
   add constraint FK_VOZILO_OSIGURAVA_POSLOVNI foreign key ("Broj osiguranja", "Broj osiguranja")
      references "Poslovni sistem" (Drzava, Identifikator)
go

alter table Vozilo
   add constraint "FK_VOZILO_TRENUTNA _ORGANIZA" foreign key ("Drzava lokacije", Agencija, Lokacija, "Drzava agencije")
      references "Organizaciona jedinica" (Drzava, "Poslovni sistem", Oznaka, "Drzava poslovnog sistema")
go

alter table "Vozilo drumskog saobracaja"
   add constraint "FK_VOZILO D_MOZE BITI_VOZILO" foreign key ("Broj vozila")
      references Vozilo ("Broj vozila")
go

alter table "Vozilo drumskog saobracaja"
   add constraint "FK_VOZILO D_MOZE BITI_TIP MOTO" foreign key (Tip)
      references "Tip motornog vozila" (Oznaka)
go

alter table "Vozilo drumskog saobracaja"
   add constraint "FK_VOZILO D_PRIPADA K_KLASA" foreign key (Klasa)
      references Klasa (Oznaka)
go

alter table "Školska sprema"
   add constraint "FK_ŠKOLSKA _KOJE ŠKOL_NIVO OBR" foreign key (Stepen, "Nivo obrazovanja")
      references "Nivo obrazovanja" (Stepen, "Nivo obrazovanja")
go

