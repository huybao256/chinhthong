function startGame() {
    const nameInput = document.getElementById('playerName').value.trim();
    const vaultCode = document.getElementById('vaultCode').value.trim();

    if (!nameInput) {
        return alert("Cậu chưa nhập tên kìa!");
    }
    
    // Kiểm tra mật mã vui vui
    if (vaultCode !== "0803") {
        return alert("Sai mật mã rồi! Gợi ý là ngày lễ sắp tới gồm 4 chữ số nhé 😉");
    }

    currentPlayer = nameInput;
    
    // Ẩn màn hình đăng nhập bằng hiệu ứng mờ dần
    const loginScreen = document.getElementById('loginScreen');
    loginScreen.style.transition = "opacity 0.5s ease";
    loginScreen.style.opacity = "0";
    
    setTimeout(() => {
        loginScreen.style.display = 'none';
        initBoard();
        startTimer();
    }, 500);
}
