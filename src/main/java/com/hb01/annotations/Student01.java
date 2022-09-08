package com.hb01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
//Ctrl+Shift+O
//Ctrl+Space
//Bu annotationu koyduğumuz sınıf veritabanında bir tabloya karşılık gelecek
@Entity
//Eğer oluşacak tablo ismini değiştirmek istenirse name attribute ile bir tablo ismi verilir.
@Table(name="t_student01")
public class Student01 {
    
    @Id
    private int id;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student01 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	//length default=255
    //nullable=true /default
    //unique=false default 
    @Column(name="student_name",length = 100,nullable = false,unique=false)
    private String name;
    
    //veritabanı tablosunda grade adında bir kolon oluşturulmaz
    @Transient
    private int grade;
    
   /*
    *  @Entity annotationu en önemli annotationdır ve bu 
    annotation bir java sınıfını  bir varlık (entity) olacağını
     *  gösterir. Bir entity, veritabanında tutulan bir tabloyu temsil eder. Bu sınıfın  her örneği, tablodaki bir satırı yani bir kaydı temsil eder.



  //  @Table annotationu , bu varlığın verilerinin tutulacağı 
   * tablo adını belirtir. @Table annotationu kullanmazsanız, hibernate,
   *  varsayılan olarak tablo adı olarak sınıf adını kullanır.



   // @Id annotationu , bu varlığın tanımlayıcısını (identity)  
    * işaretler. @Id annotationu ile Tablo üzerinde bir primary key oluşturulması sağlanır.



   // @Column annotationu , bu özellik (attribute) veya alan 
    * için sütun ayrıntılarını belirtir. @Column belirtilmezse, 
    * varsayılan olarak sütun adı olarak özellik  adı kullanılır.



   // @Transient annotationu, Hibernate'in veritabanında bu annonation 
    * ile işaretlenen attribute için bir sütun tanımlamayacağını ifade eder.



  //  @GeneratedValue annotationu birincil anahtarların (primary key) değerleri için 
   * oluşturma stratejilerini belirtir.
   * 

   // @Lob Farklı veritabanlarının farklı veri tipleri için tutabileceği veri
    *  belli kapasitededir.  @Lob ile veritabanında büyük veriler tutulabilir.
    */
    
    
}