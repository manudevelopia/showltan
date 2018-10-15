INSERT INTO USER( EMAIL, NAME, SURNAME) VALUES
('manu@showltan.com', 'Manu', 'Garcia');

INSERT INTO TAG(WORD) VALUES
('Ganster');


INSERT INTO USER_TAGS (USER_EMAIL, TAGS_WORD ) VALUES
('manu@showltan.com','Ganster');

-- INSERT INTO TAG_USERS (TAG_WORD, USERS_EMAIL) VALUES
-- ('Ganster','manu@showltan.com');