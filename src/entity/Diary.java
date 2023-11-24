/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Rifqi
 */
public class Diary {
   private String subject,isi,date;
   private int id;

    public Diary() {
    }

    public Diary( int id, String date,String subject, String isi  ) {
        this.id = id;
        this.date = date;
        this.subject = subject;
        this.isi = isi;
        
    }

    public String getSubject() {
        return subject;
    }

    public String getIsi() {
        return isi;
    }

    public String getDate() {
        return date;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
}
