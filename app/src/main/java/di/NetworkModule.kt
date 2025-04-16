package di

import api.UserApi
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    fun providesRetrofit():Retrofit{
       return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun providesUserApi(retrofit:Retrofit):UserApi{
       return retrofit.create(UserApi::class.javaaaaaa)
    }
}