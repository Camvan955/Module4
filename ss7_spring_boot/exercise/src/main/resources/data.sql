insert into blog.category( id, name )
values (1, 'Tiểu thuyết'),
        (2, 'Sách'),
        (3, 'Tự do');
insert into blog.blog(id, name, content, author, day_of_write, category_id)
values (1, 'Dế mèn phiêu lưu kí', 'hành trình phiêu lưu của dế Mèn', 'Tô Hoài', '1991-12-12', 1),
        (2, 'Java cơ bản', 'code java', 'Nguyễn Văn A', '1999-01-21', 2),
        (3, 'Quà tặng cuộc sống', 'Nhiều tác giả', 'cjhgycfácba', '2020-12-1', 3),
        (4, 'Trạng Quỳnh', 'Nhiều tác giả', 'cjhgycfácba', '2020-01-03', 3),
        (5, 'Hạt giống tâm thần', 'Nhiều tác giả', 'cjhgycfácba', '1999-01-08', 1),
        (6, 'Tôi đi code dạo', 'một số skill về code', 'Phạm Huy Hoàng', '2008-10-02', 2),
        (7, 'Hành trình chữa lành', 'chữa lành tâm hồn', 'Trần Đình Thi', '2009-01-18', 2),
        (8, 'Hạt giống tâm thần', 'Nhiều tác giả', 'cjhgycfácba', '2020-12-19', 1),
        (19, 'Dế mèn phiêu lưu kí', 'hành trình phiêu lưu của dế Mèn', 'Tô Hoài', '1022-10-11', 1),
        (10, 'Java cơ bản', 'code java', 'Nguyễn Văn A', '2019-01-04', 2),
        (11, 'Quà tặng cuộc sống', 'Nhiều tác giả', 'cjhgycfácba', '2019-01-02', 3),
        (12, 'Trạng Quỳnh', 'Nhiều tác giả', 'cjhgycfácba', '2022-11-12', 3),
        (13, 'Hạt giống tâm thần', 'Nhiều tác giả', 'cjhgycfácba', '2021-02-01', 1),
        (14, 'Tôi đi code dạo', 'một số skill về code', 'Phạm Huy Hoàng', '2018-10-01', 2),
        (15, 'Hành trình chữa lành', 'chữa lành tâm hồn', 'Trần Đình Thi', '2021-11-11', 2),
        (16, 'Hạt giống tâm thần', 'Nhiều tác giả', 'cjhgycfácba', '2027-12-12', 1);