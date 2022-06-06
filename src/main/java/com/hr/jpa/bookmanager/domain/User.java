package com.hr.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

//롬복의 @Getter, @Setter을 사용하면 일일이 Getter와 Setter을 작성하지 않아도 됨.
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Data   //{@code @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode}
@Builder
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    /*
    //@Getter
    //@Setter
    public @NonNull String getName() {
        return this.name;
    }

    public @NonNull String getEmail() {
        return this.email;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return this.updateAt;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
    */

    /*
    @ToString
    public String toString() {
        return "User(name=" + this.getName() + ", email=" + this.getEmail() + ", createdAt=" + this.getCreatedAt() + ", updateAt=" + this.getUpdateAt() + ")";
    }
    */

    /*
    //@AllArgsConstructor
    public User(@NonNull String name, @NonNull String email, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    //@NoArgsConstructor
    public User() {
    }

    //@RequiredArgsConstructor
    public User(@NonNull String name, @NonNull String email) {
        this.name = name;
        this.email = email;
    }
    */

}
