DELETE FROM code_signature;
DELETE FROM demande_signature;
DELETE FROM document;
DELETE FROM signature;
DELETE FROM signataire;
DELETE FROM utilisateur;


SELECT SETVAL('code_signature_seq', 1, false);
SELECT SETVAL('demande_signature_seq', 1, false);
SELECT SETVAL('document_seq', 1, false);
SELECT SETVAL('signature_seq', 1, false);
SELECT SETVAL('signataire_seq', 1, false);
SELECT SETVAL('utilisateur_seq', 1, false);


INSERT INTO utilisateur (uti_id, uti_nom, uti_prenom, uti_email, uti_mot_de_passe)
VALUES(NEXTVAL('utilisateur_seq'), 'Mensah', 'Jean', 'baptistejean457@gmail.com', 'password123');
INSERT INTO utilisateur (uti_id, uti_nom, uti_prenom, uti_email, uti_mot_de_passe)
values (NEXTVAL('utilisateur_seq'), 'Tremblay', 'Marc', 'marc.tremblay@example.com', 'password456');
INSERT INTO utilisateur (uti_id, uti_nom, uti_prenom, uti_email, uti_mot_de_passe)
values (NEXTVAL('utilisateur_seq'), 'Roy', 'Isabelle', 'isabelle.roy@example.com', 'password789');
INSERT INTO utilisateur (uti_id, uti_nom, uti_prenom, uti_email, uti_mot_de_passe)
values (NEXTVAL('utilisateur_seq'), 'Lavoie', 'Martin', 'martin.lavoie@example.com', 'password321');
INSERT INTO utilisateur (uti_id, uti_nom, uti_prenom, uti_email, uti_mot_de_passe)
values (NEXTVAL('utilisateur_seq'), 'Bouchard', 'Sophie', 'sophie.bouchard@example.com', 'password654');
