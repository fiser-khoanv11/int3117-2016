Báo cáo bài tuần tuần 5
+ Mô tả chương trình
	Chương trình kiểm tra 1 nhân viên có được tuyển làm việc không với các tiêu chí :
	- số năm kinh nghiệm >= 2 và điểm trung bình >= 2.0
	- sô năm kinh nghiệm < 2 và điểm trung bình >= 2.5
	- điểm trung bình >=  3.0
	
+ Áp dụng tiêu chuẩn MC/DC :
 	-  if(soNamKinhNghiem < 0 || diemTrungBinh < 0.0) đưa về dạng  if(A||B) sẽ có 3 ca kiểm
thử đầu
	A:	T	F	F
	B:	F	T	F   
	- if(diemTrungBinh >= 3.0) ta có 1 testcase
	-  if(soNamKinhNghiem >= 2 && diemTrungBinh >= 2.0)
                    ||(soNamKinhNghiem < 2 && diemTrungBinh >= 2.5)) đưa về if((A&&B)||(C&&D)) với A vs C đối lập  ta có 4 testcase
	A:	T	T	F	T
	B:	T	T	T	F
	C:	F	F	T	F
	D:	F	T	T	F
		
+ Ta có 9 bộ test 
	- nhansu[] = null;
	- soNamKinhNghiem = -1, diemTrungBinh = 2.0
	- soNamKinhNghiem = 2 , diemTrungBinh = -2.0
	- soNamKinhNghiem = 2, diemTrungBinh = 2.0
	- diemTrungBinh = 3.5
	- soNamKinhNghiem = 3, diemTrungBinh = 2.3
	- soNamKinhNghiem = 3, diemTrungBinh = 2.5
	- soNamKinhNghiem = 1, diemTrungBinh = 2.7
	- soNamKinhNghiem = 2, diemTrungBinh = 1.0
-Với chương trình này, ta có thể áp dụng bao phủ dòng lệnh mà vẫn tạo được bộ test chất lượng như MCDC