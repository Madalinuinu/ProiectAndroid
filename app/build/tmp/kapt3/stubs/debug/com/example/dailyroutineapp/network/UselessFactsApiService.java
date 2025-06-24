package com.example.dailyroutineapp.network;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/dailyroutineapp/network/UselessFactsApiService;", "", "getFact", "Lretrofit2/Call;", "Lcom/example/dailyroutineapp/network/UselessFactApiResponse;", "app_debug"})
public abstract interface UselessFactsApiService {
    
    @retrofit2.http.GET(value = "/random.json?language=en")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.example.dailyroutineapp.network.UselessFactApiResponse> getFact();
}