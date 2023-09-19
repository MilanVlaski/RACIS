/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2016                    */
/* Created on:     28. 4. 2023. 01:32:25                        */
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
   where r.fkeyid = object_id('Atribut') and o.name = 'FK_ATRIBUT_TIPOVI RE_RESURSI')
alter table Atribut
   drop constraint "FK_ATRIBUT_TIPOVI RE_RESURSI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Drava') and o.name = 'FK_DRAVA_AKTUELNI _NASELJEN')
alter table Drava
   drop constraint "FK_DRAVA_AKTUELNI _NASELJEN"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Drava') and o.name = 'FK_DRAVA_TEKUÆE UR_DRAVNO')
alter table Drava
   drop constraint "FK_DRAVA_TEKUÆE UR_DRAVNO"
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
   where r.fkeyid = object_id('"Istorija ureğenja"') and o.name = 'FK_ISTORIJA_KROZ ISTO_DRAVA')
alter table "Istorija ureğenja"
   drop constraint "FK_ISTORIJA_KROZ ISTO_DRAVA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Istorija ureğenja"') and o.name = 'FK_ISTORIJA_UREĞENJE _DRAVNO')
alter table "Istorija ureğenja"
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
   where r.fkeyid = object_id('"Korisnièki nalog"') and o.name = 'FK_KORISNIÈ_NALOG ZAP_REGISTAR')
alter table "Korisnièki nalog"
   drop constraint "FK_KORISNIÈ_NALOG ZAP_REGISTAR"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Korisnièki nalog"') and o.name = 'FK_KORISNIÈ_REGISTROV_POSLOVNI')
alter table "Korisnièki nalog"
   drop constraint FK_KORISNIÈ_REGISTROV_POSLOVNI
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
   where r.fkeyid = object_id('"Pripada roli"') and o.name = 'FK_PRIPADA _KO JE U G_ROLA')
alter table "Pripada roli"
   drop constraint "FK_PRIPADA _KO JE U G_ROLA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Pripada roli"') and o.name = 'FK_PRIPADA _SVRSTAN U_KORISNIÈ')
alter table "Pripada roli"
   drop constraint "FK_PRIPADA _SVRSTAN U_KORISNIÈ"
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
   where r.fkeyid = object_id('Region') and o.name = 'FK_REGION_ADMINISTR_NASELJEN')
alter table Region
   drop constraint FK_REGION_ADMINISTR_NASELJEN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('Region') and o.name = 'FK_REGION_MATIÈNA D_DRAVA')
alter table Region
   drop constraint "FK_REGION_MATIÈNA D_DRAVA"
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
   where r.fkeyid = object_id('"Sastav drava"') and o.name = 'FK_SASTAV D_DRAVA ÈL_DRAVA')
alter table "Sastav drava"
   drop constraint "FK_SASTAV D_DRAVA ÈL_DRAVA"
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
   where r.fkeyid = object_id('"Sistem ili podsistem"') and o.name = 'FK_SISTEM I_TIPOVI RE_RESURSI')
alter table "Sistem ili podsistem"
   drop constraint "FK_SISTEM I_TIPOVI RE_RESURSI"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloena organizaciona jedinica"') and o.name = 'FK_SLOENA _MATIÈNA O_ORGANIZA')
alter table "Sloena organizaciona jedinica"
   drop constraint "FK_SLOENA _MATIÈNA O_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloena organizaciona jedinica"') and o.name = 'FK_SLOENA _ORGANIZAC_ORGANIZA')
alter table "Sloena organizaciona jedinica"
   drop constraint "FK_SLOENA _ORGANIZAC_ORGANIZA"
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('"Sloeni poslovni sistem"') and o.name = 'FK_SLOENI _MATIÈNI P_POSLOVNI')
alter table "Sloeni poslovni sistem"
   drop constraint "FK_SLOENI _MATIÈNI P_POSLOVNI"
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
   where r.fkeyid = object_id('Tabela') and o.name = 'FK_TABELA_TIPOVI RE_RESURSI')
alter table Tabela
   drop constraint "FK_TABELA_TIPOVI RE_RESURSI"
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
            from  sysobjects
           where  id = object_id('Atribut')
            and   type = 'U')
   drop table Atribut
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Drava')
            and   name  = 'Tekuæe ureğenje_FK'
            and   indid > 0
            and   indid < 255)
   drop index Drava."Tekuæe ureğenje_FK"
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
           where  id = object_id('"Dravno ureğenje"')
            and   type = 'U')
   drop table "Dravno ureğenje"
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
           where  id    = object_id('"Istorija ureğenja"')
            and   name  = 'Ureğenje drave_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija ureğenja"."Ureğenje drave_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Istorija ureğenja"')
            and   name  = 'Kroz istoriju_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Istorija ureğenja"."Kroz istoriju_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Istorija ureğenja"')
            and   type = 'U')
   drop table "Istorija ureğenja"
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
            from  sysindexes
           where  id    = object_id('"Korisnièki nalog"')
            and   name  = 'Registrovani korisnici_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Korisnièki nalog"."Registrovani korisnici_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Korisnièki nalog"')
            and   name  = 'Nalog zaposlenog_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Korisnièki nalog"."Nalog zaposlenog_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Korisnièki nalog"')
            and   type = 'U')
   drop table "Korisnièki nalog"
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
           where  id    = object_id('"Pravni nasljednik"')
            and   name  = 'Nasljeğena drava_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Pravni nasljednik"."Nasljeğena drava_FK"
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
           where  id    = object_id('Region')
            and   name  = 'Administrativno sjedište_FK'
            and   indid > 0
            and   indid < 255)
   drop index Region."Administrativno sjedište_FK"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('Region')
            and   name  = 'Matièna drava_FK'
            and   indid > 0
            and   indid < 255)
   drop index Region."Matièna drava_FK"
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
            and   name  = 'Drava èlanica_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sastav drava"."Drava èlanica_FK"
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
            from  sysobjects
           where  id = object_id('"Sistem ili podsistem"')
            and   type = 'U')
   drop table "Sistem ili podsistem"
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('"Sloena organizaciona jedinica"')
            and   name  = 'Matièna organizaciona jedinica_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloena organizaciona jedinica"."Matièna organizaciona jedinica_FK"
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
            and   name  = 'Matièni poslovni sistem_FK'
            and   indid > 0
            and   indid < 255)
   drop index "Sloeni poslovni sistem"."Matièni poslovni sistem_FK"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Sloeni poslovni sistem"')
            and   type = 'U')
   drop table "Sloeni poslovni sistem"
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
            from  sysobjects
           where  id = object_id('Tabela')
            and   type = 'U')
   drop table Tabela
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip organizacione jedinice"')
            and   type = 'U')
   drop table "Tip organizacione jedinice"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip poslovnog sistema"')
            and   type = 'U')
   drop table "Tip poslovnog sistema"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip regiona"')
            and   type = 'U')
   drop table "Tip regiona"
go

if exists (select 1
            from  sysobjects
           where  id = object_id('"Tip sloenog poslovnog sistema"')
            and   type = 'U')
   drop table "Tip sloenog poslovnog sistema"
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
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
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
   constraint "PK_ADRESNI PODACI" primary key ("Drava registracije", "Poslovni sistem", Zaposleni, "Redni broj", Tip)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Adresni podaci"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Adresni podaci', 'column', 'Drava registracije'
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




create nonclustered index "Kontakt podaci_FK" on "Adresni podaci" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
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
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Identifikator        bigint               not null,
   Naziv                varchar(120)         not null,
   Kod                  varchar(30)          not null,
   constraint PK_ATRIBUT primary key ("Drava registracije", "Poslovni sistem", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Atribut')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Atribut', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Atribut', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Table: Drava                                                */
/*==============================================================*/
create table Drava (
   Oznaka               char(3)              not null,
   Naziv                varchar(120)         not null,
   "Datum osnivanja"    datetime             not null,
   "Glavni grad"        int                  null,
   "Dravno ureğenje"   char(1)              null,
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
/* Index: "Tekuæe ureğenje_FK"                                  */
/*==============================================================*/




create nonclustered index "Tekuæe ureğenje_FK" on Drava ("Dravno ureğenje" ASC)
go

/*==============================================================*/
/* Table: Dravljanstvo                                         */
/*==============================================================*/
create table Dravljanstvo (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Zaposleni            int                  not null,
   Dravljanstvo        char(3)              not null,
   constraint PK_DRAVLJANSTVO primary key ("Drava registracije", "Poslovni sistem", Zaposleni, Dravljanstvo)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Dravljanstvo')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Dravljanstvo', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Dravljanstvo', 'column', 'Drava registracije'
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




create nonclustered index Dravljanstvo_FK on Dravljanstvo ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Zaposleni ASC)
go

/*==============================================================*/
/* Table: "Dravno ureğenje"                                    */
/*==============================================================*/
create table "Dravno ureğenje" (
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
   Drava               char(3)              not null,
   "Glavni grad"        int                  not null,
   "Redni broj"         numeric(1,0)         not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_GLAVNI GRAD" primary key (Drava, "Glavni grad", "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Glavni grad"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Glavni grad', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Glavni grad', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Glavni grad_FK"                                      */
/*==============================================================*/




create nonclustered index "Glavni grad_FK" on "Glavni grad" (Drava ASC)
go

/*==============================================================*/
/* Index: "Glavni grad u dravi_FK"                             */
/*==============================================================*/




create nonclustered index "Glavni grad u dravi_FK" on "Glavni grad" (Drava ASC,
  "Glavni grad" ASC)
go

/*==============================================================*/
/* Table: "Istorija ureğenja"                                   */
/*==============================================================*/
create table "Istorija ureğenja" (
   Drava               char(3)              not null,
   "Redni broj"         numeric(2,0)         not null,
   "Dravno ureğenje"   char(1)              not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_ISTORIJA UREĞENJA" primary key (Drava, "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Istorija ureğenja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Istorija ureğenja', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Istorija ureğenja', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Kroz istoriju_FK"                                    */
/*==============================================================*/




create nonclustered index "Kroz istoriju_FK" on "Istorija ureğenja" (Drava ASC)
go

/*==============================================================*/
/* Index: "Ureğenje drave_FK"                                  */
/*==============================================================*/




create nonclustered index "Ureğenje drave_FK" on "Istorija ureğenja" ("Dravno ureğenje" ASC)
go

/*==============================================================*/
/* Table: "Izabrani tipovi organizacione jedinice"              */
/*==============================================================*/
create table "Izabrani tipovi organizacione jedinice" (
   "Tip organizacione jedinice" char(1)              not null,
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Aktivan              bit                  not null,
   constraint "PK_IZABRANI TIPOVI ORGANIZACIO" primary key ("Tip organizacione jedinice", "Drava registracije", "Poslovni sistem")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Izabrani tipovi organizacione jedinice"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Izabrani tipovi organizacione jedinice', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Izabrani tipovi organizacione jedinice', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Izabrana tipizacija organizacione jedinice_FK"       */
/*==============================================================*/




create nonclustered index "Izabrana tipizacija organizacione jedinice_FK" on "Izabrani tipovi organizacione jedinice" ("Tip organizacione jedinice" ASC)
go

/*==============================================================*/
/* Index: "Izbor tipizacije po poslovnom sistemu_FK"            */
/*==============================================================*/




create nonclustered index "Izbor tipizacije po poslovnom sistemu_FK" on "Izabrani tipovi organizacione jedinice" ("Drava registracije" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Katalog radnih mjesta"                               */
/*==============================================================*/
create table "Katalog radnih mjesta" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Oznaka               numeric(4,0)         not null,
   "Naziv radnog mjesta" varchar(120)         not null,
   "Planski broj izvršilaca" numeric(3,0)         not null,
   constraint "PK_KATALOG RADNIH MJESTA" primary key ("Drava registracije", "Poslovni sistem", Oznaka)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Katalog radnih mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Katalog radnih mjesta', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Katalog radnih mjesta', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Ima radna mjesta_FK"                                 */
/*==============================================================*/




create nonclustered index "Ima radna mjesta_FK" on "Katalog radnih mjesta" ("Drava registracije" ASC,
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
/* Table: "Korisnièki nalog"                                    */
/*==============================================================*/
create table "Korisnièki nalog" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "User ID"            varchar(30)          not null,
   Zaposleni            int                  not null,
   Username             varchar(15)          not null,
   Password             varchar(256)         null,
   "Datum registracije" datetime             not null,
   Aktivan              bit                  not null,
   constraint "PK_KORISNIÈKI NALOG" primary key ("Drava registracije", "Poslovni sistem", "User ID")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Korisnièki nalog"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Korisnièki nalog', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Korisnièki nalog', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Nalog zaposlenog_FK"                                 */
/*==============================================================*/




create nonclustered index "Nalog zaposlenog_FK" on "Korisnièki nalog" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Zaposleni ASC)
go

/*==============================================================*/
/* Index: "Registrovani korisnici_FK"                           */
/*==============================================================*/




create nonclustered index "Registrovani korisnici_FK" on "Korisnièki nalog" ("Drava registracije" ASC,
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
   Drava               char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   Identifikator        numeric(2,0)         not null,
   "Naziv mjesne zajednice" varchar(120)         not null,
   "Mjesna kancelarija" int                  null,
   constraint "PK_MJESNA ZAJEDNICA" primary key (Drava, "Oznaka opštine", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Mjesna zajednica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Mjesna zajednica', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Mjesna zajednica', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Ima mjesne zajednice_FK"                             */
/*==============================================================*/




create nonclustered index "Ima mjesne zajednice_FK" on "Mjesna zajednica" (Drava ASC,
  "Oznaka opštine" ASC)
go

/*==============================================================*/
/* Index: "Mjesna kancelarija_FK"                               */
/*==============================================================*/




create nonclustered index "Mjesna kancelarija_FK" on "Mjesna zajednica" (Drava ASC,
  "Mjesna kancelarija" ASC)
go

/*==============================================================*/
/* Table: "Mjesno pokrivanje naselja"                           */
/*==============================================================*/
create table "Mjesno pokrivanje naselja" (
   Drava               char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   "Naseljeno mjesto"   int                  not null,
   "Mjesna zajednica"   numeric(2,0)         not null,
   constraint "PK_MJESNO POKRIVANJE NASELJA" primary key ("Oznaka opštine", "Mjesna zajednica", Drava, "Naseljeno mjesto")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Mjesno pokrivanje naselja"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Mjesno pokrivanje naselja', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Mjesno pokrivanje naselja', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Mjesno pokrivanje naselja2_FK"                       */
/*==============================================================*/




create nonclustered index "Mjesno pokrivanje naselja2_FK" on "Mjesno pokrivanje naselja" (Drava ASC,
  "Naseljeno mjesto" ASC)
go

/*==============================================================*/
/* Index: "Mjesno pokrivanje naselja_FK"                        */
/*==============================================================*/




create nonclustered index "Mjesno pokrivanje naselja_FK" on "Mjesno pokrivanje naselja" (Drava ASC,
  "Oznaka opštine" ASC,
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
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Školska sprema"     char(2)              not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   constraint "PK_OBRAZUJU ZA" primary key (Stepen, "Nivo obrazovanja", "Školska sprema", "Drava registracije", "Poslovni sistem")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Obrazuju za"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Obrazuju za', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Obrazuju za', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Obrazuju za2_FK"                                     */
/*==============================================================*/




create nonclustered index "Obrazuju za2_FK" on "Obrazuju za" ("Drava registracije" ASC,
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
   "Tip regiona"        char(1)              not null,
   "Oznaka regiona"     smallint             not null,
   Drava               char(3)              not null,
   "Naseljeno mjesto"   int                  not null,
   constraint "PK_OBUHVATA NASELJA" primary key (Drava, "Naseljeno mjesto", "Tip regiona", "Oznaka regiona")
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




create nonclustered index "Obuhvata naselja2_FK" on "Obuhvata naselja" ("Tip regiona" ASC,
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
   Drava               char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   "Naseljeno mjesto"   int                  not null,
   constraint "PK_OBUHVATA OPŠTINE" primary key ("Oznaka opštine", Drava, "Naseljeno mjesto")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Obuhvata opštine"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Obuhvata opštine', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Obuhvata opštine', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Obuhvata opštine2_FK"                                */
/*==============================================================*/




create nonclustered index "Obuhvata opštine2_FK" on "Obuhvata opštine" (Drava ASC,
  "Naseljeno mjesto" ASC)
go

/*==============================================================*/
/* Index: "Obuhvata opštine_FK"                                 */
/*==============================================================*/




create nonclustered index "Obuhvata opštine_FK" on "Obuhvata opštine" (Drava ASC,
  "Oznaka opštine" ASC)
go

/*==============================================================*/
/* Table: Opština                                               */
/*==============================================================*/
create table Opština (
   Drava               char(3)              not null,
   "Oznaka opštine"     numeric(3,0)         not null,
   "Naziv opštine"      varchar(120)         not null,
   "Sjedište opštine"   int                  null,
   constraint PK_OPŠTINA primary key (Drava, "Oznaka opštine")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Opština')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Opština', 'column', 'Drava'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Opština', 'column', 'Drava'
go

/*==============================================================*/
/* Index: "Lokalna samouprava_FK"                               */
/*==============================================================*/




create nonclustered index "Lokalna samouprava_FK" on Opština (Drava ASC)
go

/*==============================================================*/
/* Index: "Središte opštine_FK"                                 */
/*==============================================================*/




create nonclustered index "Središte opštine_FK" on Opština (Drava ASC,
  "Sjedište opštine" ASC)
go

/*==============================================================*/
/* Table: "Organizaciona jedinica"                              */
/*==============================================================*/
create table "Organizaciona jedinica" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Oznaka               numeric(4)           not null,
   "Tip organizacione jedinice" char(1)              not null,
   "Sjedište organizacione jedinice" int                  not null,
   Naziv                varchar(120)         not null,
   Adresa               varchar(120)         null,
   Telefon              varchar(11)          null,
   email                varchar(60)          null,
   constraint "PK_ORGANIZACIONA JEDINICA" primary key (Oznaka, "Drava registracije", "Poslovni sistem")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Organizaciona jedinica', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Sjedište organizacione jedinice_FK"                  */
/*==============================================================*/




create nonclustered index "Sjedište organizacione jedinice_FK" on "Organizaciona jedinica" ("Drava registracije" ASC,
  "Sjedište organizacione jedinice" ASC)
go

/*==============================================================*/
/* Index: "Tipizacija organizacione jedinice_FK"                */
/*==============================================================*/




create nonclustered index "Tipizacija organizacione jedinice_FK" on "Organizaciona jedinica" ("Tip organizacione jedinice" ASC,
  "Drava registracije" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Index: "Unutrašnja organizacija_FK"                          */
/*==============================================================*/




create nonclustered index "Unutrašnja organizacija_FK" on "Organizaciona jedinica" ("Drava registracije" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Personalna restrikcija"                              */
/*==============================================================*/
create table "Personalna restrikcija" (
   "Drava registracije" char(3)              not null,
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
   constraint "PK_PERSONALNA RESTRIKCIJA" primary key (Atribut, Tabela, "Drava registracije", "Poslovni sistem", Korisnik, Rola, Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Personalna restrikcija"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Personalna restrikcija', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Personalna restrikcija', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Personalna restrikcija2_FK"                          */
/*==============================================================*/




create nonclustered index "Personalna restrikcija2_FK" on "Personalna restrikcija" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Korisnik ASC,
  Rola ASC,
  Identifikator ASC)
go

/*==============================================================*/
/* Index: "Personalna restrikcija atributa_FK"                  */
/*==============================================================*/




create nonclustered index "Personalna restrikcija atributa_FK" on "Personalna restrikcija" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Atribut ASC)
go

/*==============================================================*/
/* Index: "Personalna restrikcija tabela_FK"                    */
/*==============================================================*/




create nonclustered index "Personalna restrikcija tabela_FK" on "Personalna restrikcija" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Tabela ASC)
go

/*==============================================================*/
/* Table: "Podaci o obrazovanju"                                */
/*==============================================================*/
create table "Podaci o obrazovanju" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Zaposleni            int                  not null,
   "Redni broj"         numeric(2,0)         not null,
   "Školska sprema"     char(2)              not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   Zvanje               char(2)              not null,
   "Drava obrazovne ustanove" char(3)              null,
   "Obrazovna ustanova" bigint               null,
   "Datum upisa"        datetime             not null,
   "Datum završetka"    datetime             not null,
   "Datum diplomiranja" datetime             null,
   "Broj diplome"       varchar(14)          null,
   constraint "PK_PODACI O OBRAZOVANJU" primary key ("Drava registracije", "Poslovni sistem", Zaposleni, "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Podaci o obrazovanju"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Drava registracije'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Podaci o obrazovanju"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava obrazovne ustanove')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Drava obrazovne ustanove'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Podaci o obrazovanju', 'column', 'Drava obrazovne ustanove'
go

/*==============================================================*/
/* Index: "Obrazovna ustanova_FK"                               */
/*==============================================================*/




create nonclustered index "Obrazovna ustanova_FK" on "Podaci o obrazovanju" ("Drava obrazovne ustanove" ASC,
  "Obrazovna ustanova" ASC)
go

/*==============================================================*/
/* Index: "Podaci o obrazovanju_FK"                             */
/*==============================================================*/




create nonclustered index "Podaci o obrazovanju_FK" on "Podaci o obrazovanju" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Zaposleni ASC)
go

/*==============================================================*/
/* Index: "Tipizacija zvanja_FK"                                */
/*==============================================================*/




create nonclustered index "Tipizacija zvanja_FK" on "Podaci o obrazovanju" ("Drava registracije" ASC,
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
/* Table: "Poslovni sistem"                                     */
/*==============================================================*/
create table "Poslovni sistem" (
   "Drava registracije" char(3)              not null,
   Identifikator        bigint               not null,
   "Tip poslovnog sistema" char(1)              not null,
   "Sjedište poslovnog sistema" int                  not null,
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
   Peèat                image                null,
   "Digitalni potpis"   image                null,
   "Drava registracije sljedbenika" char(3)              null,
   "Poslovni sistem sljedbenik" bigint               null,
   constraint "PK_POSLOVNI SISTEM" primary key ("Drava registracije", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Drava registracije'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije sljedbenika')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Drava registracije sljedbenika'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Poslovni sistem', 'column', 'Drava registracije sljedbenika'
go

/*==============================================================*/
/* Index: "Drava poslovnog sistema_FK"                         */
/*==============================================================*/




create nonclustered index "Drava poslovnog sistema_FK" on "Poslovni sistem" ("Drava registracije" ASC)
go

/*==============================================================*/
/* Index: "Pravni sljedbenik_FK"                                */
/*==============================================================*/




create nonclustered index "Pravni sljedbenik_FK" on "Poslovni sistem" ("Drava registracije sljedbenika" ASC,
  "Poslovni sistem sljedbenik" ASC)
go

/*==============================================================*/
/* Index: "Sjedište poslovnog sistema_FK"                       */
/*==============================================================*/




create nonclustered index "Sjedište poslovnog sistema_FK" on "Poslovni sistem" ("Drava registracije" ASC,
  "Sjedište poslovnog sistema" ASC)
go

/*==============================================================*/
/* Index: "Tipizacija poslovnog sistema_FK"                     */
/*==============================================================*/




create nonclustered index "Tipizacija poslovnog sistema_FK" on "Poslovni sistem" ("Tip poslovnog sistema" ASC)
go

/*==============================================================*/
/* Table: "Potrebna školska sprema"                             */
/*==============================================================*/
create table "Potrebna školska sprema" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Radno mjesto"       numeric(4,0)         not null,
   "Školska sprema"     char(2)              not null,
   Stepen               numeric(1)           not null,
   "Nivo obrazovanja"   smallint             not null,
   constraint "PK_POTREBNA ŠKOLSKA SPREMA" primary key ("Drava registracije", "Poslovni sistem", "Radno mjesto", Stepen, "Nivo obrazovanja", "Školska sprema")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Potrebna školska sprema"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Potrebna školska sprema', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Potrebna školska sprema', 'column', 'Drava registracije'
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




create nonclustered index "Školska sprema za radno mjesto_FK" on "Potrebna školska sprema" ("Drava registracije" ASC,
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
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Tabela               bigint               not null,
   "Povezana tabela"    bigint               not null,
   constraint "PK_POVEZANA SA" primary key (Tabela, "Drava registracije", "Poslovni sistem", "Povezana tabela")
)
go

/*==============================================================*/
/* Index: Tabela_FK                                             */
/*==============================================================*/




create nonclustered index Tabela_FK on "Povezana sa" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Tabela ASC)
go

/*==============================================================*/
/* Index: "Povezana tabela_FK"                                  */
/*==============================================================*/




create nonclustered index "Povezana tabela_FK" on "Povezana sa" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  "Povezana tabela" ASC)
go

/*==============================================================*/
/* Table: "Pravni nasljednik"                                   */
/*==============================================================*/
create table "Pravni nasljednik" (
   Nasljednica          char(3)              not null,
   Nasljeğena           char(3)              not null,
   constraint "PK_PRAVNI NASLJEDNIK" primary key (Nasljeğena, Nasljednica)
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
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Nasljeğena')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Pravni nasljednik', 'column', 'Nasljeğena'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Pravni nasljednik', 'column', 'Nasljeğena'
go

/*==============================================================*/
/* Index: "Drava pravni nasljednik_FK"                         */
/*==============================================================*/




create nonclustered index "Drava pravni nasljednik_FK" on "Pravni nasljednik" (Nasljednica ASC)
go

/*==============================================================*/
/* Index: "Nasljeğena drava_FK"                                */
/*==============================================================*/




create nonclustered index "Nasljeğena drava_FK" on "Pravni nasljednik" (Nasljeğena ASC)
go

/*==============================================================*/
/* Table: "Pravo na podsistem"                                  */
/*==============================================================*/
create table "Pravo na podsistem" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Sistem               bigint               not null,
   Rola                 char(2)              not null,
   Pristup              bit                  not null,
   constraint "PK_PRAVO NA PODSISTEM" primary key (Sistem, "Drava registracije", "Poslovni sistem", Rola)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pravo na podsistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Pravo na podsistem', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Pravo na podsistem', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Sistem pripada roli_FK"                              */
/*==============================================================*/




create nonclustered index "Sistem pripada roli_FK" on "Pravo na podsistem" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Sistem ASC)
go

/*==============================================================*/
/* Index: "Rola obuhvata sistem_FK"                             */
/*==============================================================*/




create nonclustered index "Rola obuhvata sistem_FK" on "Pravo na podsistem" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Rola ASC)
go

/*==============================================================*/
/* Table: "Predefinisane role radnih mjesta"                    */
/*==============================================================*/
create table "Predefinisane role radnih mjesta" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Radno mjesto"       numeric(4,0)         not null,
   "Oznaka role"        char(2)              not null,
   constraint "PK_PREDEFINISANE ROLE RADNIH M" primary key ("Drava registracije", "Poslovni sistem", "Oznaka role", "Radno mjesto")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Predefinisane role radnih mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Predefinisane role radnih mjesta', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Predefinisane role radnih mjesta', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Predefinisane role radnih mjesta_FK"                 */
/*==============================================================*/




create nonclustered index "Predefinisane role radnih mjesta_FK" on "Predefinisane role radnih mjesta" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  "Oznaka role" ASC)
go

/*==============================================================*/
/* Index: "Predefinisane role radnih mjesta2_FK"                */
/*==============================================================*/




create nonclustered index "Predefinisane role radnih mjesta2_FK" on "Predefinisane role radnih mjesta" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  "Radno mjesto" ASC)
go

/*==============================================================*/
/* Table: "Pripada roli"                                        */
/*==============================================================*/
create table "Pripada roli" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Oznaka role"        char(2)              not null,
   Korisnik             varchar(30)          not null,
   Identifikator        bigint               not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_PRIPADA ROLI" primary key ("Drava registracije", "Poslovni sistem", Korisnik, "Oznaka role", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Pripada roli"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Pripada roli', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Pripada roli', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Ko je u grupi_FK"                                    */
/*==============================================================*/




create nonclustered index "Ko je u grupi_FK" on "Pripada roli" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  "Oznaka role" ASC)
go

/*==============================================================*/
/* Index: "Svrstan u grupu_FK"                                  */
/*==============================================================*/




create nonclustered index "Svrstan u grupu_FK" on "Pripada roli" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Korisnik ASC)
go

/*==============================================================*/
/* Table: "Raspored na radna mjesta"                            */
/*==============================================================*/
create table "Raspored na radna mjesta" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
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
   constraint "PK_RASPORED NA RADNA MJESTA" primary key (Zaposleni, "Redni broj", "Drava registracije", "Poslovni sistem")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Raspored na radna mjesta"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Raspored na radna mjesta', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Kadrovi u organizacionoj jedinici_FK"                */
/*==============================================================*/




create nonclustered index "Kadrovi u organizacionoj jedinici_FK" on "Raspored na radna mjesta" ("Organizaciona jedinica" ASC,
  "Drava registracije" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Index: "Raspored zaposlenih_FK"                              */
/*==============================================================*/




create nonclustered index "Raspored zaposlenih_FK" on "Raspored na radna mjesta" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  "Radno mjesto" ASC)
go

/*==============================================================*/
/* Index: "Raspored zaposlenog_FK"                              */
/*==============================================================*/




create nonclustered index "Raspored zaposlenog_FK" on "Raspored na radna mjesta" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Zaposleni ASC)
go

/*==============================================================*/
/* Index: "Tipizacija radnog odnosa_FK"                         */
/*==============================================================*/




create nonclustered index "Tipizacija radnog odnosa_FK" on "Raspored na radna mjesta" ("Vrsta radnog odnosa" ASC)
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
/* Index: "Matièna drava_FK"                                   */
/*==============================================================*/




create nonclustered index "Matièna drava_FK" on Region ("Pripada dravi" ASC)
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
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Redni broj evidencije" int                  not null,
   Prezime              varchar(60)          not null,
   "Ime roditelja"      varchar(60)          null,
   Ime                  varchar(60)          not null,
   Pol                  char(1)              not null default ''
      constraint CKC_POL_REGISTAR check (Pol in ('M','','N')),
   "Matièni broj"       varchar(13)          null,
   constraint "PK_REGISTAR ZAPOSLENIH" primary key ("Drava registracije", "Poslovni sistem", "Redni broj evidencije")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Registar zaposlenih"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Registar zaposlenih', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Registar zaposlenih', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: Zapošljava_FK                                         */
/*==============================================================*/




create nonclustered index Zapošljava_FK on "Registar zaposlenih" ("Drava registracije" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Restrikcija atributa"                                */
/*==============================================================*/
create table "Restrikcija atributa" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Atribut              bigint               not null,
   Rola                 char(2)              not null,
   Dodavanje            bit                  not null,
   Izmjena              bit                  not null,
   Brisanje             bit                  not null,
   Pretraga             bit                  not null,
   constraint "PK_RESTRIKCIJA ATRIBUTA" primary key ("Drava registracije", "Poslovni sistem", Atribut, Rola)
)
go

/*==============================================================*/
/* Index: "Restrikcija atributa2_FK"                            */
/*==============================================================*/




create nonclustered index "Restrikcija atributa2_FK" on "Restrikcija atributa" ("Drava registracije" ASC,
  Atribut ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Index: "Rola obuhvata akcije_FK"                             */
/*==============================================================*/




create nonclustered index "Rola obuhvata akcije_FK" on "Restrikcija atributa" ("Drava registracije" ASC,
  Atribut ASC,
  Rola ASC)
go

/*==============================================================*/
/* Table: "Restrikcija nad tabelama"                            */
/*==============================================================*/
create table "Restrikcija nad tabelama" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Tabela               bigint               not null,
   Rola                 char(2)              not null,
   Dodavanje            bit                  not null,
   Brisanje             bit                  not null,
   Izmjena              bit                  not null,
   Pretraga             bit                  not null,
   constraint "PK_RESTRIKCIJA NAD TABELAMA" primary key (Tabela, "Drava registracije", "Poslovni sistem", Rola)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Restrikcija nad tabelama"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Restrikcija nad tabelama', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Restrikcija nad tabelama', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Rola obuhvata tabele_FK"                             */
/*==============================================================*/




create nonclustered index "Rola obuhvata tabele_FK" on "Restrikcija nad tabelama" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Rola ASC)
go

/*==============================================================*/
/* Index: "Restrikcija nad tabelama2_FK"                        */
/*==============================================================*/




create nonclustered index "Restrikcija nad tabelama2_FK" on "Restrikcija nad tabelama" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Tabela ASC)
go

/*==============================================================*/
/* Table: Rola                                                  */
/*==============================================================*/
create table Rola (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Oznaka role"        char(2)              not null,
   Prioritet            smallint             not null,
   "Naziv role"         varchar(80)          not null,
   Opis                 varchar(1000)        null,
   constraint PK_ROLA primary key ("Drava registracije", "Poslovni sistem", "Oznaka role")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Rola')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Rola', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Rola', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Role poslovnog sistema_FK"                           */
/*==============================================================*/




create nonclustered index "Role poslovnog sistema_FK" on Rola ("Drava registracije" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Sadri atribute"                                     */
/*==============================================================*/
create table "Sadri atribute" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Tabela               bigint               not null,
   Atribut              bigint               not null,
   constraint "PK_SADRI ATRIBUTE" primary key ("Drava registracije", "Poslovni sistem", Atribut, Tabela)
)
go

/*==============================================================*/
/* Index: "Pripadaju tabeli_FK"                                 */
/*==============================================================*/




create nonclustered index "Pripadaju tabeli_FK" on "Sadri atribute" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Atribut ASC)
go

/*==============================================================*/
/* Index: "Sadri atribute2_FK"                                 */
/*==============================================================*/




create nonclustered index "Sadri atribute2_FK" on "Sadri atribute" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Tabela ASC)
go

/*==============================================================*/
/* Table: "Sadri podsisteme"                                   */
/*==============================================================*/
create table "Sadri podsisteme" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Sistem               bigint               not null,
   Podsistem            bigint               not null,
   constraint "PK_SADRI PODSISTEME" primary key (Sistem, "Drava registracije", "Poslovni sistem", Podsistem)
)
go

/*==============================================================*/
/* Index: Sistem_FK                                             */
/*==============================================================*/




create nonclustered index Sistem_FK on "Sadri podsisteme" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Sistem ASC)
go

/*==============================================================*/
/* Index: Podsistem_FK                                          */
/*==============================================================*/




create nonclustered index Podsistem_FK on "Sadri podsisteme" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Podsistem ASC)
go

/*==============================================================*/
/* Table: "Sadri tabele"                                       */
/*==============================================================*/
create table "Sadri tabele" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Sistem               bigint               not null,
   Tabela               bigint               not null,
   constraint "PK_SADRI TABELE" primary key (Tabela, "Drava registracije", "Poslovni sistem", Sistem)
)
go

/*==============================================================*/
/* Index: "Sadri tabele2_FK"                                   */
/*==============================================================*/




create nonclustered index "Sadri tabele2_FK" on "Sadri tabele" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Sistem ASC)
go

/*==============================================================*/
/* Index: "Pripadaju podsistemu_FK"                             */
/*==============================================================*/




create nonclustered index "Pripadaju podsistemu_FK" on "Sadri tabele" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Tabela ASC)
go

/*==============================================================*/
/* Table: "Sastav drava"                                       */
/*==============================================================*/
create table "Sastav drava" (
   "Sloena drava"     char(3)              not null,
   "Drava èlanica"     char(3)              not null,
   "Redni broj"         numeric(2,0)         not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_SASTAV DRAVA" primary key ("Drava èlanica", "Sloena drava", "Redni broj")
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
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava èlanica')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sastav drava', 'column', 'Drava èlanica'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sastav drava', 'column', 'Drava èlanica'
go

/*==============================================================*/
/* Index: "Sloena drava_FK"                                   */
/*==============================================================*/




create nonclustered index "Sloena drava_FK" on "Sastav drava" ("Sloena drava" ASC)
go

/*==============================================================*/
/* Index: "Drava èlanica_FK"                                   */
/*==============================================================*/




create nonclustered index "Drava èlanica_FK" on "Sastav drava" ("Drava èlanica" ASC)
go

/*==============================================================*/
/* Table: "Sastav regiona"                                      */
/*==============================================================*/
create table "Sastav regiona" (
   "Tip sloenog regiona" char(1)              not null,
   "Sloeni region"     smallint             not null,
   "Tip èlana"          char(1)              not null,
   "Region èlan"        smallint             not null,
   constraint "PK_SASTAV REGIONA" primary key ("Tip sloenog regiona", "Sloeni region", "Tip èlana", "Region èlan")
)
go

/*==============================================================*/
/* Index: "Region u sastavu_FK"                                 */
/*==============================================================*/




create nonclustered index "Region u sastavu_FK" on "Sastav regiona" ("Tip èlana" ASC,
  "Region èlan" ASC)
go

/*==============================================================*/
/* Index: "Sastavljeni region_FK"                               */
/*==============================================================*/




create nonclustered index "Sastavljeni region_FK" on "Sastav regiona" ("Tip sloenog regiona" ASC,
  "Sloeni region" ASC)
go

/*==============================================================*/
/* Table: "Sistem ili podsistem"                                */
/*==============================================================*/
create table "Sistem ili podsistem" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Identifikator        bigint               not null,
   Naziv                varchar(120)         not null,
   Kod                  varchar(30)          not null,
   constraint "PK_SISTEM ILI PODSISTEM" primary key ("Drava registracije", "Poslovni sistem", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sistem ili podsistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sistem ili podsistem', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sistem ili podsistem', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Table: "Sloena organizaciona jedinica"                      */
/*==============================================================*/
create table "Sloena organizaciona jedinica" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   "Sloena jedinica"   numeric(4)           not null,
   "Jedinica u sastavu" numeric(4)           not null,
   constraint "PK_SLOENA ORGANIZACIONA JEDIN" primary key ("Sloena jedinica", "Drava registracije", "Poslovni sistem", "Jedinica u sastavu")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloena organizaciona jedinica"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sloena organizaciona jedinica', 'column', 'Drava registracije'
go

/*==============================================================*/
/* Index: "Organizaciona jedinica u sastavu_FK"                 */
/*==============================================================*/




create nonclustered index "Organizaciona jedinica u sastavu_FK" on "Sloena organizaciona jedinica" ("Jedinica u sastavu" ASC,
  "Drava registracije" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Index: "Matièna organizaciona jedinica_FK"                   */
/*==============================================================*/




create nonclustered index "Matièna organizaciona jedinica_FK" on "Sloena organizaciona jedinica" ("Sloena jedinica" ASC,
  "Drava registracije" ASC,
  "Poslovni sistem" ASC)
go

/*==============================================================*/
/* Table: "Sloeni poslovni sistem"                             */
/*==============================================================*/
create table "Sloeni poslovni sistem" (
   "Matièna drava registracije" char(3)              not null,
   "Matièni poslovni sistem" bigint               not null,
   "Drava registracije èlanice" char(3)              not null,
   "Poslovni sistem èlanica" bigint               not null,
   "Redni broj"         numeric(1)           not null,
   "Tip sloenog poslovnog sistema" char(1)              not null,
   Od                   datetime             not null,
   Do                   datetime             null,
   constraint "PK_SLOENI POSLOVNI SISTEM" primary key ("Matièna drava registracije", "Matièni poslovni sistem", "Drava registracije èlanice", "Poslovni sistem èlanica", "Redni broj")
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloeni poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Matièna drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Matièna drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Matièna drava registracije'
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('"Sloeni poslovni sistem"')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije èlanice')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Drava registracije èlanice'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Sloeni poslovni sistem', 'column', 'Drava registracije èlanice'
go

/*==============================================================*/
/* Index: "Matièni poslovni sistem_FK"                          */
/*==============================================================*/




create nonclustered index "Matièni poslovni sistem_FK" on "Sloeni poslovni sistem" ("Matièna drava registracije" ASC,
  "Matièni poslovni sistem" ASC)
go

/*==============================================================*/
/* Index: "Sistem u sastavu_FK"                                 */
/*==============================================================*/




create nonclustered index "Sistem u sastavu_FK" on "Sloeni poslovni sistem" ("Drava registracije èlanice" ASC,
  "Poslovni sistem èlanica" ASC)
go

/*==============================================================*/
/* Index: "Tipizacija sloenog poslovnog sistema_FK"            */
/*==============================================================*/




create nonclustered index "Tipizacija sloenog poslovnog sistema_FK" on "Sloeni poslovni sistem" ("Tip sloenog poslovnog sistema" ASC)
go

/*==============================================================*/
/* Table: "Struktura atributa"                                  */
/*==============================================================*/
create table "Struktura atributa" (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Atribut              bigint               not null,
   "Sadrani atribut"   bigint               not null,
   constraint "PK_STRUKTURA ATRIBUTA" primary key ("Sadrani atribut", "Drava registracije", "Poslovni sistem", Atribut)
)
go

/*==============================================================*/
/* Index: "Sadrani atribut_FK"                                 */
/*==============================================================*/




create nonclustered index "Sadrani atribut_FK" on "Struktura atributa" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  "Sadrani atribut" ASC)
go

/*==============================================================*/
/* Index: Atribut_FK                                            */
/*==============================================================*/




create nonclustered index Atribut_FK on "Struktura atributa" ("Drava registracije" ASC,
  "Poslovni sistem" ASC,
  Atribut ASC)
go

/*==============================================================*/
/* Table: Tabela                                                */
/*==============================================================*/
create table Tabela (
   "Drava registracije" char(3)              not null,
   "Poslovni sistem"    bigint               not null,
   Identifikator        bigint               not null,
   Naziv                varchar(120)         not null,
   Kod                  varchar(30)          not null,
   constraint PK_TABELA primary key ("Drava registracije", "Poslovni sistem", Identifikator)
)
go

if exists(select 1 from sys.extended_properties p where
      p.major_id = object_id('Tabela')
  and p.minor_id = (select c.column_id from sys.columns c where c.object_id = p.major_id and c.name = 'Drava registracije')
)
begin
   declare @CurrentUser sysname
select @CurrentUser = user_name()
execute sp_dropextendedproperty 'MS_Description', 
   'schema', @CurrentUser, 'table', 'Tabela', 'column', 'Drava registracije'

end


select @CurrentUser = user_name()
execute sp_addextendedproperty 'MS_Description', 
   'https://www.nationsonline.org/oneworld/country_code_list.htm',
   'schema', @CurrentUser, 'table', 'Tabela', 'column', 'Drava registracije'
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
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Adresni podaci"
   add constraint "FK_ADRESNI _KONTAKT P_REGISTAR" foreign key ("Drava registracije", "Poslovni sistem", Zaposleni)
      references "Registar zaposlenih" ("Drava registracije", "Poslovni sistem", "Redni broj evidencije")
go

alter table "Adresni podaci"
   add constraint "FK_ADRESNI _MJESTO AD_NASELJEN" foreign key (Drava, Mjesto)
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table Drava
   add constraint "FK_DRAVA_AKTUELNI _NASELJEN" foreign key (Oznaka, "Glavni grad")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table Drava
   add constraint "FK_DRAVA_TEKUÆE UR_DRAVNO" foreign key ("Dravno ureğenje")
      references "Dravno ureğenje" (Oznaka)
go

alter table Dravljanstvo
   add constraint FK_DRAVLJA_DRAVLJAN_REGISTAR foreign key ("Drava registracije", "Poslovni sistem", Zaposleni)
      references "Registar zaposlenih" ("Drava registracije", "Poslovni sistem", "Redni broj evidencije")
go

alter table Dravljanstvo
   add constraint FK_DRAVLJA_DRAVLJAN_DRAVA foreign key (Dravljanstvo)
      references Drava (Oznaka)
go

alter table "Glavni grad"
   add constraint "FK_GLAVNI G_GLAVNI GR_DRAVA" foreign key (Drava)
      references Drava (Oznaka)
go

alter table "Glavni grad"
   add constraint "FK_GLAVNI G_GLAVNI GR_NASELJEN" foreign key (Drava, "Glavni grad")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Istorija ureğenja"
   add constraint "FK_ISTORIJA_KROZ ISTO_DRAVA" foreign key (Drava)
      references Drava (Oznaka)
go

alter table "Istorija ureğenja"
   add constraint "FK_ISTORIJA_UREĞENJE _DRAVNO" foreign key ("Dravno ureğenje")
      references "Dravno ureğenje" (Oznaka)
go

alter table "Izabrani tipovi organizacione jedinice"
   add constraint "FK_IZABRANI_IZABRANA _TIP ORGA" foreign key ("Tip organizacione jedinice")
      references "Tip organizacione jedinice" (Oznaka)
go

alter table "Izabrani tipovi organizacione jedinice"
   add constraint "FK_IZABRANI_IZBOR TIP_POSLOVNI" foreign key ("Drava registracije", "Poslovni sistem")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Katalog radnih mjesta"
   add constraint "FK_KATALOG _IMA RADNA_POSLOVNI" foreign key ("Drava registracije", "Poslovni sistem")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Katalog zanimanja"
   add constraint "FK_KATALOG _REGISTROV_DRAVA" foreign key (Drava)
      references Drava (Oznaka)
go

alter table "Katalog zvanja"
   add constraint "FK_KATALOG _KATALOG Z_DRAVA" foreign key (Dr_Oznaka)
      references Drava (Oznaka)
go

alter table "Korisnièki nalog"
   add constraint "FK_KORISNIÈ_NALOG ZAP_REGISTAR" foreign key ("Drava registracije", "Poslovni sistem", Zaposleni)
      references "Registar zaposlenih" ("Drava registracije", "Poslovni sistem", "Redni broj evidencije")
go

alter table "Korisnièki nalog"
   add constraint FK_KORISNIÈ_REGISTROV_POSLOVNI foreign key ("Drava registracije", "Poslovni sistem")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
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
   add constraint "FK_MJESNA Z_IMA MJESN_OPŠTINA" foreign key (Drava, "Oznaka opštine")
      references Opština (Drava, "Oznaka opštine")
go

alter table "Mjesna zajednica"
   add constraint "FK_MJESNA Z_SJEDIŠTE _NASELJEN" foreign key (Drava, "Mjesna kancelarija")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Mjesno pokrivanje naselja"
   add constraint "FK_MJESNO P_MJESNA ZA_MJESNA Z" foreign key (Drava, "Oznaka opštine", "Mjesna zajednica")
      references "Mjesna zajednica" (Drava, "Oznaka opštine", Identifikator)
go

alter table "Mjesno pokrivanje naselja"
   add constraint "FK_MJESNO P_PRIPADA M_NASELJEN" foreign key (Drava, "Naseljeno mjesto")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Naseljeno mjesto"
   add constraint "FK_NASELJEN_SADRI NA_DRAVA" foreign key (Drava)
      references Drava (Oznaka)
go

alter table "Obrazuju za"
   add constraint "FK_OBRAZUJU_OBRAZUJU _POSLOVNI" foreign key ("Drava registracije", "Poslovni sistem")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Obrazuju za"
   add constraint "FK_OBRAZUJU_ŠKOLSKE S_ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", "Školska sprema")
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Obuhvata naselja"
   add constraint "FK_OBUHVATA_OBUHVATA _REGION" foreign key ("Tip regiona", "Oznaka regiona")
      references Region ("Tip regiona", "Oznaka regiona")
go

alter table "Obuhvata naselja"
   add constraint "FK_OBUHVATA_PRIPADA R_NASELJEN" foreign key (Drava, "Naseljeno mjesto")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Obuhvata opštine"
   add constraint "FK_OBUHVATA_OPŠTINA O_OPŠTINA" foreign key (Drava, "Oznaka opštine")
      references Opština (Drava, "Oznaka opštine")
go

alter table "Obuhvata opštine"
   add constraint "FK_OBUHVATA_OBUHVATA _NASELJEN2" foreign key (Drava, "Naseljeno mjesto")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table Opština
   add constraint "FK_OPŠTINA_LOKALNA S_DRAVA" foreign key (Drava)
      references Drava (Oznaka)
go

alter table Opština
   add constraint "FK_OPŠTINA_SJEDIŠTE _NASELJEN" foreign key (Drava, "Sjedište opštine")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Organizaciona jedinica"
   add constraint "FK_ORGANIZA_SJEDIŠTE _NASELJEN" foreign key ("Drava registracije", "Sjedište organizacione jedinice")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table "Organizaciona jedinica"
   add constraint FK_ORGANIZA_TIPIZACIJ_IZABRANI foreign key ("Tip organizacione jedinice", "Drava registracije", "Poslovni sistem")
      references "Izabrani tipovi organizacione jedinice" ("Tip organizacione jedinice", "Drava registracije", "Poslovni sistem")
go

alter table "Organizaciona jedinica"
   add constraint FK_ORGANIZA_UNUTRAŠNJ_POSLOVNI foreign key ("Drava registracije", "Poslovni sistem")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Personalna restrikcija"
   add constraint FK_PERSONAL_PERSONALN_PRIPADA foreign key ("Drava registracije", "Poslovni sistem", Korisnik, Rola, Identifikator)
      references "Pripada roli" ("Drava registracije", "Poslovni sistem", Korisnik, "Oznaka role", Identifikator)
go

alter table "Personalna restrikcija"
   add constraint FK_PERSONAL_PERSONALN_ATRIBUT foreign key ("Drava registracije", "Poslovni sistem", Atribut)
      references Atribut ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Personalna restrikcija"
   add constraint FK_PERSONAL_PERSONALN_TABELA foreign key ("Drava registracije", "Poslovni sistem", Tabela)
      references Tabela ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_OBRAZOVNA_POSLOVNI" foreign key ("Drava obrazovne ustanove", "Obrazovna ustanova")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_PODACI O _REGISTAR" foreign key ("Drava registracije", "Poslovni sistem", Zaposleni)
      references "Registar zaposlenih" ("Drava registracije", "Poslovni sistem", "Redni broj evidencije")
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_TIPIZACIJ_KATALOG" foreign key ("Drava registracije", Zvanje)
      references "Katalog zvanja" (Dr_Oznaka, Oznaka)
go

alter table "Podaci o obrazovanju"
   add constraint "FK_PODACI O_TIPIZACIJ_ŠKOLSKA" foreign key (Stepen, "Nivo obrazovanja", "Školska sprema")
      references "Školska sprema" (Stepen, "Nivo obrazovanja", Oznaka)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_DRAVA PO_DRAVA" foreign key ("Drava registracije")
      references Drava (Oznaka)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_PRAVNI SL_POSLOVNI" foreign key ("Drava registracije sljedbenika", "Poslovni sistem sljedbenik")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Poslovni sistem"
   add constraint "FK_POSLOVNI_SJEDIŠTE _NASELJEN" foreign key ("Drava registracije", "Sjedište poslovnog sistema")
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
   add constraint "FK_POTREBNA_ŠKOLSKA S_KATALOG" foreign key ("Drava registracije", "Poslovni sistem", "Radno mjesto")
      references "Katalog radnih mjesta" ("Drava registracije", "Poslovni sistem", Oznaka)
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
   add constraint "FK_POVEZANA_POVEZANA _TABELA" foreign key ("Drava registracije", "Poslovni sistem", "Povezana tabela")
      references Tabela ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Povezana sa"
   add constraint FK_POVEZANA_TABELA_TABELA foreign key ("Drava registracije", "Poslovni sistem", Tabela)
      references Tabela ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Pravni nasljednik"
   add constraint "FK_PRAVNI N_DRAVA PR_DRAVA" foreign key (Nasljednica)
      references Drava (Oznaka)
go

alter table "Pravni nasljednik"
   add constraint "FK_PRAVNI N_NASLJEĞEN_DRAVA" foreign key (Nasljeğena)
      references Drava (Oznaka)
go

alter table "Pravo na podsistem"
   add constraint "FK_PRAVO NA_ROLA OBUH_ROLA" foreign key ("Drava registracije", "Poslovni sistem", Rola)
      references Rola ("Drava registracije", "Poslovni sistem", "Oznaka role")
go

alter table "Pravo na podsistem"
   add constraint "FK_PRAVO NA_SISTEM PR_SISTEM I" foreign key ("Drava registracije", "Poslovni sistem", Sistem)
      references "Sistem ili podsistem" ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Predefinisane role radnih mjesta"
   add constraint FK_PREDEFIN_PREDEFINI_KATALOG foreign key ("Drava registracije", "Poslovni sistem", "Radno mjesto")
      references "Katalog radnih mjesta" ("Drava registracije", "Poslovni sistem", Oznaka)
go

alter table "Predefinisane role radnih mjesta"
   add constraint "FK_PREDEFIN_ROLE ZA R_ROLA" foreign key ("Drava registracije", "Poslovni sistem", "Oznaka role")
      references Rola ("Drava registracije", "Poslovni sistem", "Oznaka role")
go

alter table "Pripada roli"
   add constraint "FK_PRIPADA _KO JE U G_ROLA" foreign key ("Drava registracije", "Poslovni sistem", "Oznaka role")
      references Rola ("Drava registracije", "Poslovni sistem", "Oznaka role")
go

alter table "Pripada roli"
   add constraint "FK_PRIPADA _SVRSTAN U_KORISNIÈ" foreign key ("Drava registracije", "Poslovni sistem", Korisnik)
      references "Korisnièki nalog" ("Drava registracije", "Poslovni sistem", "User ID")
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_KADROVI U_ORGANIZA" foreign key ("Organizaciona jedinica", "Drava registracije", "Poslovni sistem")
      references "Organizaciona jedinica" (Oznaka, "Drava registracije", "Poslovni sistem")
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_RASPORED _KATALOG" foreign key ("Drava registracije", "Poslovni sistem", "Radno mjesto")
      references "Katalog radnih mjesta" ("Drava registracije", "Poslovni sistem", Oznaka)
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_RASPORED _REGISTAR" foreign key ("Drava registracije", "Poslovni sistem", Zaposleni)
      references "Registar zaposlenih" ("Drava registracije", "Poslovni sistem", "Redni broj evidencije")
go

alter table "Raspored na radna mjesta"
   add constraint "FK_RASPORED_TIPIZACIJ_VRSTA RA" foreign key ("Vrsta radnog odnosa")
      references "Vrsta radnog odnosa" (Oznaka)
go

alter table Region
   add constraint FK_REGION_ADMINISTR_NASELJEN foreign key ("Drava sjedišta", "Administrativno sjedište")
      references "Naseljeno mjesto" (Drava, Oznaka)
go

alter table Region
   add constraint "FK_REGION_MATIÈNA D_DRAVA" foreign key ("Pripada dravi")
      references Drava (Oznaka)
go

alter table Region
   add constraint "FK_REGION_TIPIZACIJ_TIP REGI" foreign key ("Tip regiona")
      references "Tip regiona" (Oznaka)
go

alter table "Registar zaposlenih"
   add constraint FK_REGISTAR_ZAPOŠLJAV_POSLOVNI foreign key ("Drava registracije", "Poslovni sistem")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Restrikcija atributa"
   add constraint "FK_RESTRIKC_ATRIBUTI _ATRIBUT" foreign key ("Drava registracije", Atribut, "Poslovni sistem")
      references Atribut ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Restrikcija atributa"
   add constraint "FK_RESTRIKC_ROLA OBUH_ROLA2" foreign key ("Drava registracije", Atribut, Rola)
      references Rola ("Drava registracije", "Poslovni sistem", "Oznaka role")
go

alter table "Restrikcija nad tabelama"
   add constraint "FK_RESTRIKC_ROLA OBUH_ROLA" foreign key ("Drava registracije", "Poslovni sistem", Rola)
      references Rola ("Drava registracije", "Poslovni sistem", "Oznaka role")
go

alter table "Restrikcija nad tabelama"
   add constraint "FK_RESTRIKC_TABELE PR_TABELA" foreign key ("Drava registracije", "Poslovni sistem", Tabela)
      references Tabela ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table Rola
   add constraint "FK_ROLA_ROLE POSL_POSLOVNI" foreign key ("Drava registracije", "Poslovni sistem")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Sadri atribute"
   add constraint "FK_SADRI A_PRIPADAJU_ATRIBUT" foreign key ("Drava registracije", "Poslovni sistem", Atribut)
      references Atribut ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Sadri atribute"
   add constraint "FK_SADRI A_SADRI AT_TABELA" foreign key ("Drava registracije", "Poslovni sistem", Tabela)
      references Tabela ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Sadri podsisteme"
   add constraint "FK_SADRI P_PODSISTEM_SISTEM I" foreign key ("Drava registracije", "Poslovni sistem", Podsistem)
      references "Sistem ili podsistem" ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Sadri podsisteme"
   add constraint "FK_SADRI P_SISTEM_SISTEM I" foreign key ("Drava registracije", "Poslovni sistem", Sistem)
      references "Sistem ili podsistem" ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Sadri tabele"
   add constraint "FK_SADRI T_PRIPADAJU_TABELA" foreign key ("Drava registracije", "Poslovni sistem", Tabela)
      references Tabela ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Sadri tabele"
   add constraint "FK_SADRI T_SADRI TA_SISTEM I" foreign key ("Drava registracije", "Poslovni sistem", Sistem)
      references "Sistem ili podsistem" ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Sastav drava"
   add constraint "FK_SASTAV D_DRAVA ÈL_DRAVA" foreign key ("Drava èlanica")
      references Drava (Oznaka)
go

alter table "Sastav drava"
   add constraint "FK_SASTAV D_SLOENA D_DRAVA" foreign key ("Sloena drava")
      references Drava (Oznaka)
go

alter table "Sastav regiona"
   add constraint "FK_SASTAV R_REGION U _REGION" foreign key ("Tip èlana", "Region èlan")
      references Region ("Tip regiona", "Oznaka regiona")
go

alter table "Sastav regiona"
   add constraint "FK_SASTAV R_SASTAVLJE_REGION" foreign key ("Tip sloenog regiona", "Sloeni region")
      references Region ("Tip regiona", "Oznaka regiona")
go

alter table "Sloena organizaciona jedinica"
   add constraint "FK_SLOENA _MATIÈNA O_ORGANIZA" foreign key ("Sloena jedinica", "Drava registracije", "Poslovni sistem")
      references "Organizaciona jedinica" (Oznaka, "Drava registracije", "Poslovni sistem")
go

alter table "Sloena organizaciona jedinica"
   add constraint "FK_SLOENA _ORGANIZAC_ORGANIZA" foreign key ("Jedinica u sastavu", "Drava registracije", "Poslovni sistem")
      references "Organizaciona jedinica" (Oznaka, "Drava registracije", "Poslovni sistem")
go

alter table "Sloeni poslovni sistem"
   add constraint "FK_SLOENI _MATIÈNI P_POSLOVNI" foreign key ("Matièna drava registracije", "Matièni poslovni sistem")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Sloeni poslovni sistem"
   add constraint "FK_SLOENI _SISTEM U _POSLOVNI" foreign key ("Drava registracije èlanice", "Poslovni sistem èlanica")
      references "Poslovni sistem" ("Drava registracije", Identifikator)
go

alter table "Sloeni poslovni sistem"
   add constraint "FK_SLOENI _TIPIZACIJ_TIP SLO" foreign key ("Tip sloenog poslovnog sistema")
      references "Tip sloenog poslovnog sistema" (Oznaka)
go

alter table "Struktura atributa"
   add constraint FK_STRUKTUR_ATRIBUT_ATRIBUT foreign key ("Drava registracije", "Poslovni sistem", Atribut)
      references Atribut ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Struktura atributa"
   add constraint "FK_STRUKTUR_SADRANI _ATRIBUT" foreign key ("Drava registracije", "Poslovni sistem", "Sadrani atribut")
      references Atribut ("Drava registracije", "Poslovni sistem", Identifikator)
go

alter table "Školska sprema"
   add constraint "FK_ŠKOLSKA _KOJE ŠKOL_NIVO OBR" foreign key (Stepen, "Nivo obrazovanja")
      references "Nivo obrazovanja" (Stepen, "Nivo obrazovanja")
go

