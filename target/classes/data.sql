-- INSERT EMPLOYEES			
insert into employee (employee_id, first_name, last_name, email) values (1, 'Huong', 'Nguyen', 'huongnguyen@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (2, 'Duong', 'Nguyen', 'duongnguyen@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (3, 'Thi', 'Tran', 'Thitran@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (4, 'Giang', 'Nguyen', 'Giangnguyen@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (5, 'Ha', 'Le', 'Hale@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (6, 'Thuy', 'Dao', 'Thuydao@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (7, 'Ngoc', 'Dinh', 'Ngocdinh@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (8, 'Mai', 'Luu', 'Mailuu@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (9, 'Trang', 'Nguyen', 'Trangnguyen@gmail.com');

-- INSERT PROJECTS			
insert into project (project_id, name, stage, description) values (1000, 'Large Production Deploy', 'NOTSTARTED', 'This requires all hands on deck for the final deployment of the software into production');
insert into project (project_id, name, stage, description) values (1001, 'New Employee Budget',  'COMPLETED', 'Decide on a new employee bonus budget for the year and figureout who will be promoted');
insert into project (project_id, name, stage, description) values (1002, 'Office Reconstruction', 'INPROGRESS', 'The office building in Monroe has been damaged due to hurricane in the region. This needs to be reconstructed');
insert into project (project_id, name, stage, description) values (1003, 'Improve Intranet Security', 'INPROGRESS', 'With the recent data hack, the office security needs to be improved and proper security team needs to be hired for implementation');

-- INSERT PROJECT_EMPLOYEE_RELATION (Removed duplicates from video)
insert into project_employee (employee_id, project_id) values (1,1000);
insert into project_employee (employee_id, project_id) values (1,1001);
insert into project_employee (employee_id, project_id) values (1,1002);
insert into project_employee (employee_id, project_id) values (3,1000);
insert into project_employee (employee_id, project_id) values (6,1002);
insert into project_employee (employee_id, project_id) values (6,1003);
													