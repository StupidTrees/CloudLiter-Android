package com.stupidtree.hichat.ui.main;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import com.stupidtree.hichat.data.model.UserLocal;
import com.stupidtree.hichat.data.repository.LocalUserRepository;

public class MainViewModel extends ViewModel {


    /**
     * 仓库区
     */
    //本地用户仓库
    LocalUserRepository localUserRepository;

    public MainViewModel(){
        localUserRepository = LocalUserRepository.getInstance();
    }

    @NonNull
    public UserLocal getLocalUser() {
        return localUserRepository.getLoggedInUser();
    }
}
