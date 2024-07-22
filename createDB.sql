CREATE TABLE Language (langugage_id varchar(3) NOT NULL, language varchar(255) NOT NULL UNIQUE, PRIMARY KEY (langugage_id));
CREATE TABLE Tickets (ticket_id int IDENTITY NOT NULL, ticket_name varchar(255) NOT NULL, valid_zones text NOT NULL, valid_transport_modes text NOT NULL, validity_date date NOT NULL, city varchar(255) NOT NULL, PRIMARY KEY (ticket_id));
CREATE TABLE Users (user_id int IDENTITY NOT NULL, email int NOT NULL, password_hash int NOT NULL UNIQUE, preferred_currency varchar(3) NOT NULL, preferred_language varchar(3) NOT NULL, PRIMARY KEY (user_id));
CREATE UNIQUE INDEX Language_langugage_id ON Language (langugage_id);
CREATE UNIQUE INDEX Users_email ON Users (email);
ALTER TABLE Users ADD CONSTRAINT FKUsers35657 FOREIGN KEY (preferred_language) REFERENCES Language (langugage_id);
ALTER TABLE Users ADD CONSTRAINT FKUsers958204 FOREIGN KEY (preferred_currency) REFERENCES Language (langugage_id);
