/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hurricane
 */
public class Member {
    String member_id;
    String nama;
    String tanggal_lahir;
    String alamat;
    int province_id;
    int regencies_id;
    int district_id;
    String nomer_telepon;
    String jenis_kelamin;
    String agama;

    public Member(String member_id, String nama, String tanggal_lahir, String alamat, int province_id, int regencies_id, int district_id, String nomer_telepon, String jenis_kelamin, String agama) {
        this.member_id = member_id;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
        this.province_id = province_id;
        this.regencies_id = regencies_id;
        this.district_id = district_id;
        this.nomer_telepon = nomer_telepon;
        this.jenis_kelamin = jenis_kelamin;
        this.agama = agama;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public int getRegencies_id() {
        return regencies_id;
    }

    public void setRegencies_id(int regencies_id) {
        this.regencies_id = regencies_id;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public String getNomer_telepon() {
        return nomer_telepon;
    }

    public void setNomer_telepon(String nomer_telepon) {
        this.nomer_telepon = nomer_telepon;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }
    
        
}
