create index IX_58078059 on opencps_applicant (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_35F6491B on opencps_applicant (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7941D62B on opencps_employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_370FEB6D on opencps_employee (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_253CEBA8 on opencps_employee_jobpos (employeeId);
create index IX_F9CB80BF on opencps_employee_jobpos (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E16B2B01 on opencps_employee_jobpos (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_20408734 on opencps_jobpos (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6EE94AB6 on opencps_jobpos (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_31C5CE40 on opencps_officesite (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_72ECE4C2 on opencps_officesite (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_158E960F on opencps_preferences (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A6935451 on opencps_preferences (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9425BACC on opencps_workingunit (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4136844E on opencps_workingunit (uuid_[$COLUMN_LENGTH:75$], groupId);