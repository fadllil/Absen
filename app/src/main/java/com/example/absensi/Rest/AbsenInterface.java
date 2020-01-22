package com.example.absensi.Rest;


import com.example.absensi.model.ResponseAbsen;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AbsenInterface {
    @FormUrlEncoded
    @POST("chome/pagiValidasi")
    Call<ResponseAbsen> tambahAbsen(@Field("id") String id,
                                    @Field("imei") String imei,
                                    @Field("tgl_absen") String tgl_absen);
}
