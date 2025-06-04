package com.example.userr_service.Service;

import org.springframework.stereotype.Service;

@Service
public class OtpService {
//    Random random = new Random();
//    Map<Userr, OtpData> otpStore = new HashMap<>() ;
    //    public boolean verifyEmail(Long id, OtpData otpData){
//        Userr user = userrRepo.findById(id).orElse(null) ;
//        assert user != null;
//        generateOtp(user.getUsername()) ;
//        sendOtpViaQueue(otpData);
//
//        OtpData stored_otp = otpStore.get(user); // fetched 3939
//
//        if(stored_otp == null || stored_otp.getExpiryDate().isBefore(LocalDateTime.now())){
//            return false ;
//        }
//
//        return otpData.getOtp().equals(stored_otp.getOtp());
//    }
//
//    public void generateOtp(String email) {
//        Integer randomInt = 1000 + random.nextInt(9999); // suppose 3939 generated
//        Userr user = userrRepo.findByEmail(email);
//
//        otpStore.put(user, new OtpData(randomInt, email)) ; // ("divyam@gmail.com" , 3939)
//        System.out.println("OTP for " + email + ": " + randomInt);
//    }
//
//    public void sendOtpViaQueue(OtpData otpData) {
//        amqpTemplate.convertAndSend(
//                MessagingConfig.EXCHANGE,
//                MessagingConfig.ROUTING_KEY,
//                otpData
//        );
//    }
}
