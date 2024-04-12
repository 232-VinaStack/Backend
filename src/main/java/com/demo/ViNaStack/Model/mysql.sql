-- Thêm dữ liệu vào bảng `appointment`
INSERT INTO appointment (clinic, start_time, user_name, user_phone) VALUES
                                                                        ('Clinic A', '2024-04-11 08:00:00', 'Nguyen Van A', '0123456789'),
                                                                        ('Clinic B', '2024-04-11 09:00:00', 'Tran Thi B', '0123456790'),
                                                                        ('Clinic C', '2024-04-11 10:00:00', 'Le Van C', '0123456781'),
                                                                        ('Clinic D', '2024-04-11 11:00:00', 'Pham Thi D', '0123456792'),
                                                                        ('Clinic E', '2024-04-11 12:00:00', 'Hoang Van E', '0123456783');

-- Thêm dữ liệu vào bảng `clinic`
INSERT INTO clinic (name, symptom) VALUES
                                       ('Clinic A', 'Cough'),
                                       ('Clinic B', 'Fever'),
                                       ('Clinic C', 'Headache'),
                                       ('Clinic D', 'Sore Throat'),
                                       ('Clinic E', 'Fatigue');


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
INSERT INTO doctor_clinic (doctor_id, clinic_id) VALUES
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





