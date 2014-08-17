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