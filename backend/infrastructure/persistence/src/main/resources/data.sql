INSERT INTO tb_users (name, email, password, role, enabled) VALUES ('Jose','jose@mail.com','123','ADMIN',true);
INSERT INTO tb_contact_message (name, email, message, created_at) VALUES ('Barbara','barbara@mail.com','Hello word', CURRENT_TIMESTAMP);
INSERT INTO tb_team_member (id, name, photo_url, role, linkedin_url) VALUES (1, 'Pedro', 'www.photo.com.br', 'Programador', 'www.linkedinUrl.com.br');
INSERT INTO tb_company_info (name, history, mission, vision) VALUES ('Coral Cobra Games', 'Fundada em 2025, por dois amigos games', 'Proporcionar uma melhor jogabilidade', 'Diversao sempre');
INSERT INTO tb_update (title, full_text, date, type, author_id) VALUES ('Nova funcionalidade: Login com Google', 'Agora é possível logar com a conta do Google.', CURRENT_TIMESTAMP,'NOVA_FUNCIONALIDADE', 1);