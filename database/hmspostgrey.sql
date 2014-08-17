-- Table: doctors

-- DROP TABLE doctors;

CREATE TABLE doctors
(
  iddoctors integer NOT NULL,
  name character varying(45) NOT NULL,
  address character varying(45) DEFAULT NULL::character varying,
  contact_number character varying(45) DEFAULT NULL::character varying,
  doctor_reg_number character varying(45) DEFAULT NULL::character varying,
  doctor_specialty character varying(45) DEFAULT NULL::character varying,
  CONSTRAINT doctors_pkey PRIMARY KEY (iddoctors)
)
WITH (
  OIDS=FALSE
);

-- Sequence: seq_doctors

-- DROP SEQUENCE seq_doctors;

CREATE SEQUENCE seq_doctors
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;


-- Table: patients

-- DROP TABLE patients;

CREATE TABLE patients
(
  idpatients integer NOT NULL,
  name character varying(45) DEFAULT NULL::character varying,
  address character varying(45) DEFAULT NULL::character varying,
  contact_number character varying(45) DEFAULT NULL::character varying,
  govt_photo_id character varying(45) DEFAULT NULL::character varying,
  photo_path character varying(45) DEFAULT NULL::character varying,
  CONSTRAINT patients_pkey PRIMARY KEY (idpatients)
)
WITH (
  OIDS=FALSE
);

-- Sequence: seq_patients

-- DROP SEQUENCE seq_patients;

CREATE SEQUENCE seq_patients
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;