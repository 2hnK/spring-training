-- BCrypt 인코딩된 비밀번호 사용
-- admin: $2a$10$XptfskLsT1l/bRTLRiiCgejHqOpgXFreUnNUa35gJdCr2v2QbVFzu (원본: admin)
-- user: $2a$10$EblS4Y/8OLRvj8j1xsblDOt8YKpU3M0p4aNlC5r8N4iYhFKb6E8v. (원본: user)

INSERT INTO USERS (USERNAME, NICKNAME, EMAIL, PASSWORD, CREATED_AT) VALUES
('admin', '관리자', 'admin@test.com', '$2a$10$XptfskLsT1l/bRTLRiiCgejHqOpgXFreUnNUa35gJdCr2v2QbVFzu', '2025-01-01 00:00:00'),
('user', '사용자', 'user@test.com', '$2a$10$EblS4Y/8OLRvj8j1xsblDOt8YKpU3M0p4aNlC5r8N4iYhFKb6E8v.', '2025-01-01 00:00:00'),
('kimjihoon', '지훈', 'kimgh921@gmail.com', 'qwer1234', '2025-09-29 11:54:14'),
('kimminjun', '민준', 'minjun.kim@test.com', 'pass123', '2025-07-15 10:25:14'),
('leeseoyeon', '서연', 's_yeon.lee@test.com', 'love9876', '2025-07-18 14:05:52'),
('parkdoyoon', '도윤', 'doyoon.park@test.com', 'park_dy22', '2025-07-22 09:11:03'),
('choihaeun', '하은', 'haeun.choi@test.com', 'choi_ha', '2025-07-25 18:45:21'),
('jungsiwoo', '시우', 'siwoo.jung@test.com', 'jung_sw1', '2025-08-01 11:30:00'),
('kangjian', '지안', 'jian.kang@test.com', 'kang_2025', '2025-08-03 21:00:19'),
('choseojun', '서준', 'seojun.cho@test.com', 'choseo', '2025-08-07 13:12:45'),
('yoonarin', '아린', 'arin.yoon@test.com', 'yoon4321', '2025-08-11 16:55:30'),
('jangyejun', '예준', 'yejun.jang@test.com', 'jang_yj_', '2025-08-16 08:20:11'),
('limhayoon', '하윤', 'hayoon.lim@test.com', 'limhayoon', '2025-08-20 17:01:02'),
('hanyuju', '유주', 'yuju.han@test.com', 'hanyou1004', '2025-08-24 22:15:48'),
('oheunwoo', '은우', 'eunwoo.oh@test.com', 'oh_ew_00', '2025-08-28 12:00:00'),
('seoian', '이안', 'ian.seo@test.com', 'seoians', '2025-09-02 10:48:09'),
('hwangjiho', '지호', 'jiho.hwang@test.com', 'hwang_pass', '2025-09-05 19:23:56'),
('songyuna', '유나', 'yuna.song@test.com', 'song_yuna', '2025-09-10 15:33:17'),
('kwonjuwon', '주원', 'juwon.kwon@test.com', 'kwon1122', '2025-09-12 09:50:24'),
('hongdaeun', '다은', 'daeun.hong@test.com', 'hongda_25', '2025-09-15 11:18:33'),
('moonjihoo', '지후', 'jihoo.moon@test.com', 'moonlight', '2025-09-19 23:50:01'),
('baesua', '수아', 'sua.bae@test.com', 'sua_bae_pw', '2025-09-22 14:29:10'),
('ryujunseo', '준서', 'junseo.ryu@test.com', 'ryu_pass_js', '2025-09-25 09:00:00');