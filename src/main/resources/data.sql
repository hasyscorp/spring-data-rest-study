-- insert into shop (name, branch_name, hidden_string)
-- values ('이안헤어-1', '강남점', '***')


insert into shop (id, created_at, updated_at, branch_name, hidden_string, name) values (1, now(), now(), 'branch1', '****', 'shop1');
insert into shop (id, created_at, updated_at, branch_name, hidden_string, name) values (2, now(), now(), 'branch2', '****', 'shop2');
insert into shop (id, created_at, updated_at, branch_name, hidden_string, name) values (3, now(), now(), 'branch3', '****', 'shop3');
insert into shop (id, created_at, updated_at, branch_name, hidden_string, name) values (4, now(), now(), 'branch4', '****', 'shop4');
insert into shop (id, created_at, updated_at, branch_name, hidden_string, name) values (5, now(), now(), 'branch5', '****', 'shop5');
insert into shop (id, created_at, updated_at, branch_name, hidden_string, name) values (6, now(), now(), 'branch6', '****', 'shop6');

insert into styler (id, created_at, updated_at, hidden_string, name, shop_id) values (1, now(), now(), '***', 'styler1', 1);
insert into styler (id, created_at, updated_at, hidden_string, name, shop_id) values (2, now(), now(), '***', 'styler2', 1);
insert into styler (id, created_at, updated_at, hidden_string, name, shop_id) values (3, now(), now(), '***', 'styler3', 2);
insert into styler (id, created_at, updated_at, hidden_string, name, shop_id) values (4, now(), now(), '***', 'styler4', 2);
insert into styler (id, created_at, updated_at, hidden_string, name, shop_id) values (5, now(), now(), '***', 'styler5', 3);
insert into styler (id, created_at, updated_at, hidden_string, name, shop_id) values (6, now(), now(), '***', 'styler6', 3);