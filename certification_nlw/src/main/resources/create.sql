INSERT INTO questions (id, description, technology) VALUES

    ('d66741c2-7e63-4d06-a428-64d6e359bc61', 'Descrição da pergunta 1', 'Tecnologia 1'),
    ('2e9aa354-6704-4a21-b372-71294d7885bb', 'Descrição da pergunta 2', 'Tecnologia 1'),
    ('6e9b9168-8dd8-4b35-a05e-06b9c42c65c4', 'Descrição da pergunta 3', 'Tecnologia 1');

-- Alternativas para a pergunta com id 'd66741c2-7e63-4d06-a428-64d6e359bc61'
INSERT INTO alternatives (id, question_id, is_correct, description)
VALUES
    ('d50b0ff5-f4d8-4bf9-bc09-9aa6e33e8de3', 'd66741c2-7e63-4d06-a428-64d6e359bc61', false, 'Alternativa A para a pergunta 1'),
    ('f0b09a24-b93e-4589-a55d-7de2059bfa4c', 'd66741c2-7e63-4d06-a428-64d6e359bc61', true, 'Alternativa B para a pergunta 1'),
    ('b861c5e1-7be5-446a-8ec2-8b206c5f36a0', 'd66741c2-7e63-4d06-a428-64d6e359bc61', false, 'Alternativa C para a pergunta 1'),
    ('6e5fd1d7-83a2-4d52-af45-1fb67b84fd44', 'd66741c2-7e63-4d06-a428-64d6e359bc61', false, 'Alternativa D para a pergunta 1');

-- Alternativas para a pergunta com id '2e9aa354-6704-4a21-b372-71294d7885bb'
INSERT INTO alternatives (id, question_id, is_correct, description)
VALUES
    ('ed52e4c7-8606-41f2-8d5f-77a2d7c99b2e', '2e9aa354-6704-4a21-b372-71294d7885bb', true, 'Alternativa A para a pergunta 2'),
    ('e8a6711b-72d4-455b-865b-64a4f23e5aaf', '2e9aa354-6704-4a21-b372-71294d7885bb', false, 'Alternativa B para a pergunta 2'),
    ('a3a8c268-4f36-4f24-81cc-4400b469f161', '2e9aa354-6704-4a21-b372-71294d7885bb', false, 'Alternativa C para a pergunta 2'),
    ('48671ae7-f75c-4941-9fc3-0f816b8902b2', '2e9aa354-6704-4a21-b372-71294d7885bb', false, 'Alternativa D para a pergunta 2');

-- Alternativas para a pergunta com id '6e9b9168-8dd8-4b35-a05e-06b9c42c65c4'
INSERT INTO alternatives (id, question_id, is_correct, description)
VALUES
    ('3b5ad39a-65f5-4fd5-9aee-bcc8120ef5c4', '6e9b9168-8dd8-4b35-a05e-06b9c42c65c4', false, 'Alternativa A para a pergunta 3'),
    ('8f21c0b2-3fa4-4b43-a1b1-b883d34524e5', '6e9b9168-8dd8-4b35-a05e-06b9c42c65c4', false, 'Alternativa B para a pergunta 3'),
    ('52cda757-7a5b-47d5-8f23-e0b26b2d96e2', '6e9b9168-8dd8-4b35-a05e-06b9c42c65c4', false, 'Alternativa C para a pergunta 3'),
    ('d0a0f38f-22bb-4458-8458-905aef7cfded', '6e9b9168-8dd8-4b35-a05e-06b9c42c65c4', true, 'Alternativa D para a pergunta 3');

