package com.jk.audiorecorder;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

public interface XiaoSaService {
    @Multipart
    @POST("hs-speech/speechControl")
    Call<BaseResponse<AudioResponse>> postProductImage(@Part MultipartBody.Part body, @PartMap Map<String, RequestBody> map);
}
