-- Thêm dữ liệu vào bảng `appointment`
INSERT INTO appointment (clinic, workday, user_name, user_phone) VALUES
                                                                     ('Clinic A', '2024-04-11 08:00:00', 'Nguyen Van A', '0123456789'),
                                                                     ('Clinic B', '2024-04-11 09:00:00', 'Tran Thi B', '0123456790'),
                                                                     ('Clinic C', '2024-04-11 10:00:00', 'Le Van C', '0123456781'),
                                                                     ('Clinic D', '2024-04-11 11:00:00', 'Pham Thi D', '0123456792'),
                                                                     ('Clinic E', '2024-04-11 12:00:00', 'Hoang Van E', '0123456783');

-- Thêm dữ liệu vào bảng `clinic`
INSERT INTO clinic (symptom, id)
VALUES
    ("d0",1),
    ("d1",2),
    ("d2",3),
    ("d3",4),
    ("d4",5),
    ("d5",6),
    ("d6",7),
    ("d7",8),
    ("d8",9),
    ("d9",10),
    ("d10",11),
    ("d11",12),
    ("d12",13),
    ("d13",14),
    ("d14",15),
    ("d15",16),
    ("d16",17),
    ("d17",18),
    ("d18",19),
    ("d19",20),
    ("d20",21),
    ("d21",22),
    ("d22",23),
    ("d23",24),
    ("d24",25),
    ("d25",26),
    ("d26",27),
    ("d27",28);


INSERT INTO `doctor` (`id`, `avatar_link`, `education`, `exp_year`, `name`) VALUES
                                                                                (1, 'https://thumbs.dreamstime.com/b/portrait-happy-arabic-doctor-male-blue-background-square-smiling-to-camera-wearing-white-uniform-posing-headshot-cheerful-233544543.jpg', 'University of Medicine', 10, 'Dr. John Doe'),
                                                                                (2, 'https://media.istockphoto.com/id/1340883379/photo/young-doctor-hospital-medical-medicine-health-care-clinic-office-portrait-glasses-man.jpg?s=612x612&w=0&k=20&c=_H4VUPBkS0gEj5ZdZzQo-Hw3lMuyofJpB-P9yS92Wyw=', 'Harvard Medical School', 15, 'Dr. Jane Smith'),
                                                                                (3, 'https://img.freepik.com/free-photo/attractive-young-male-nutriologist-lab-coat-smiling-against-white-background_662251-2960.jpg', 'Stanford School of Medicine', 8, 'Dr. Michael Johnson'),
                                                                                (4, 'https://thumbs.dreamstime.com/b/doctor-square-18545494.jpg', 'Yale School of Medicine', 12, 'Dr. Emily Wilson'),
                                                                                (5, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2hQledVpequKkm1ZHrhIoeS1UOo09CuHqCgstxd_B1w&s', 'Johns Hopkins University School of Medicine', 20, 'Dr. Robert Lee'),
                                                                                (6, 'https://thumbs.dreamstime.com/z/woman-doctor-2426012.jpg', 'Columbia University Vagelos College of Physicians and Surgeons', 18, 'Dr. Maria Garcia'),
                                                                                (7, 'https://www.imc-healthcare.com/wp-content/uploads/2022/08/international-medical-clinic-headshots-square-Dr-Chris-Eldridge.jpg', 'University of California, San Francisco School of Medicine', 14, 'Dr. David Martinez'),
                                                                                (8, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRCQK1Fj6SJIpgzvjzB8RYGYKnL8MjztGRqnwEuDamSzg&s', 'Perelman School of Medicine at the University of Pennsylvania', 11, 'Dr. Laura Brown'),
                                                                                (9, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTN9iSzX3jpSCkGvPfB4jRTFYGQ6znHhZ44blp-4RwKWA&s', 'Washington University in St. Louis School of Medicine', 9, 'Dr. William Taylor'),
                                                                                (10, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTO_hyZAe5l3LA2kR5esvGTaeEiQtVWzMze_Jg1XH4F8Q&s', 'University of Michigan Medical School', 7, 'Dr. Jennifer Anderson'),
                                                                                (11, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDFWifgaD1r0vFcCPqA5VX-MtAZHjMTIcQWXDfd1UE6A&s', 'Mayo Clinic Alix School of Medicine', 16, 'Dr. Christopher Clark'),
                                                                                (12, 'https://www.squarehospital.com/storage/images/1670918911.png', 'University of Chicago Pritzker School of Medicine', 13, 'Dr. Amanda Lewis'),
                                                                                (13, 'https://www.squarehospital.com/storage/images/1676179048.png', 'Duke University School of Medicine', 22, 'Dr. Sarah Walker'),
                                                                                (14, 'https://www.squarehospital.com/storage/images/1674367360.png', 'University of Washington School of Medicine', 19, 'Dr. Daniel Baker'),
                                                                                (15, 'https://www.doctorbangladesh.com/wp-content/uploads/Dr.-Mofizur-Rahman.jpg', 'Northwestern University Feinberg School of Medicine', 6, 'Dr. Karen Hill'),
                                                                                (16, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkooy_vCeYZvV17sej2qE2up8lKZ15Hwnwxcp8BTw_YQ&s', 'Baylor College of Medicine', 21, 'Dr. Joseph Wright'),
                                                                                (17, 'https://www.squarehospital.com/storage/images/1607836262.jpg', 'New York University Grossman School of Medicine', 17, 'Dr. Susan Murphy'),
                                                                                (18, 'https://www.doctorbangladesh.com/wp-content/uploads/Prof.-Dr.-Md.-Zulfiqar-Hasan.jpg', 'University of Pittsburgh School of Medicine', 10, 'Dr. Richard Garcia'),
                                                                                (19, 'https://thumbs.dreamstime.com/z/african-american-doctor-2046867.jpg', 'University of Southern California Keck School of Medicine', 8, 'Dr. Elizabeth Adams'),
                                                                                (20, 'https://media.licdn.com/dms/image/D4E03AQGR8eQIlIdgWA/profile-displayphoto-shrink_800_800/0/1689957217657?e=2147483647&v=beta&t=apxBTlJEKnl7B1Twr8FQioI43PZXRw7rpzpegNLXZHc', 'University of Virginia School of Medicine', 5, 'Dr. Kevin Brown');



-- Thêm dữ liệu vào bảng `symptom`
INSERT INTO symptom (name) VALUES
                               ('Cough'),
                               ('Fever'),
                               ('Headache'),
                               ('Sore Throat'),
                               ('Fatigue');


-- Thêm dữ liệu vào bảng `doctor`
INSERT INTO doctor (avatar_link, education, exp_year, name) VALUES
                                                                ('link_to_avatar_1', 'MD', 10, 'Dr. A'),
                                                                ('link_to_avatar_2', 'MD', 8, 'Dr. B'),
                                                                ('link_to_avatar_3', 'PhD', 5, 'Dr. C'),
                                                                ('link_to_avatar_4', 'MD', 15, 'Dr. D'),
                                                                ('link_to_avatar_5', 'MD', 20, 'Dr. E');

-- Thêm dữ liệu vào bảng `doctor_clinic`
INSERT INTO clinic_doctor (doctor_id, clinic_id) VALUES
                                                     (1, 1),
                                                     (2, 2),
                                                     (3, 3),
                                                     (4, 4),
                                                     (5, 5);



-- Thêm dữ liệu vào bảng `appointment_doctor`
INSERT INTO appointment_doctor (doctor_id, appointment_id) VALUES
                                                               (1, 1),
                                                               (2, 2),
                                                               (3, 3),
                                                               (4, 4),
                                                               (5, 5);

-- Thêm dữ liệu vào bảng `appointment_symptom`
INSERT INTO appointment_symptom (appointment_id, symptom_id) VALUES
                                                                 (1, 1),
                                                                 (2, 2),
                                                                 (3, 3),
                                                                 (4, 4),
                                                                 (5, 5);


