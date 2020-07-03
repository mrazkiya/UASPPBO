package com.Ppbo.SpringCrud.model;


import javax.persistence.*;

@Entity
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nama;
    private String jurusan;
    private String nim;
    private String jk;
    
    @Version
    @Column(name = "optVersion", columnDefinition = "integer DEFAULT 0")
    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }
    
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
