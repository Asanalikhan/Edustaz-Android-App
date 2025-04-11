package com.example.edustaz.ui.screen.materials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.edustaz.data.model.FilterResponse
import com.example.edustaz.data.model.MaterialsResponse
import com.example.edustaz.data.remote.NetworkResponse
import com.example.edustaz.data.remote.RetrofitClient
import kotlinx.coroutines.launch

class MaterialsViewModel : ViewModel() {

    val apiService = RetrofitClient.apiService

    private val _filterResponse = MutableLiveData<NetworkResponse<FilterResponse>>()
    val filterResponse: LiveData<NetworkResponse<FilterResponse>> = _filterResponse

    private val _materialsResponse = MutableLiveData<NetworkResponse<MaterialsResponse>>()
    val materialsResponse: LiveData<NetworkResponse<MaterialsResponse>> = _materialsResponse

    fun getFilter(token: String) {
        viewModelScope.launch {
            _filterResponse.postValue(NetworkResponse.Loading)
            try {
                val response = apiService.getFilter(token)
                if (response.isSuccessful) {
                    response.body()?.let {
                        _filterResponse.postValue(NetworkResponse.Success(it))
                    } ?: run {
                        _filterResponse.postValue(NetworkResponse.Error("Empty body"))
                    }
                } else {
                    _filterResponse.postValue(NetworkResponse.Error("Error: ${response.message()}"))
                }
            } catch (e: Exception) {
                _filterResponse.postValue(NetworkResponse.Error("$e"))
            }
        }
    }

    fun getMaterials(token: String) {
        viewModelScope.launch {
            _materialsResponse.postValue(NetworkResponse.Loading)
            try {
                val response = apiService.getMaterials(token)
                if (response.isSuccessful) {
                    response.body()?.let {
                        _materialsResponse.postValue(NetworkResponse.Success(it))
                    } ?: run {
                        _materialsResponse.postValue(NetworkResponse.Error("Empty body"))
                    }
                } else {
                    _materialsResponse.postValue(NetworkResponse.Error("Failed to get Materials"))
                }
            } catch (e: Exception) {
                _materialsResponse.postValue(NetworkResponse.Error("$e"))
            }
        }

    }


}