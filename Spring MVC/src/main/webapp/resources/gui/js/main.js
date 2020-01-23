$(function () {
    $('#studentBtn').click(function () {
        getStudentList();
    });
    ///////
    $('#editStudentDialogId').dialog({
        title: 'Edit Student',
        height: 400,
        width: 400,
        autoOpen: false,
        modal: true, //Qiraqdan hecne mudaxile  olmur
        buttons: {
            "Update": function () {
                updateStudent();

            },
            "Close": function () {
                $(this).dialog('close');
            }

        }
    });
//////////////////////////////////

});







////////////////

function getStudentList() {
    $.ajax({
        url: 'getStudentList',
        type: 'GET',
        dataType: 'html',
        success: function (response) {
            $('#studentList').html(response);

        },
        error: function () {
            alert('Error');
        }
    });
}

///////////////////////

function editStudent(studentId) {
    globStudentId = studentId;
    $.ajax({
        url: 'editStudent',
        type: 'GET',
        data: 'studentId=' + studentId,
        dataType: 'html',
        success: function (response) {
            $('#editStudentDialogId').html(response);
            $('#editStudentDialogId').dialog('open');
        }
    });
}
///////////////////////////////

    function updateStudent() {

        var name = $('#nameIdU').val();
        var surname = $('#surnameIdU').val();
        var address = $('#addressIdU').val();
        var dob = $('#dobIdU').val();
        var phone = $('#phoneIdU').val();
        var data = {
            'name': name,
            'surname': surname,
            'address': address,
            'dob': dob,
            'phone': phone,
            studentId: globStudentId
        };

        $.ajax({
            url: 'updateStudent',
            type: 'POST',
            data: data,
            dataType: 'text',
            success: function (response) {
                if (response == 'success') {
                    alert('Student has been successfully updated!');
                    getStudentList();
                    $('#editStudentDialogId').dialog('close');
                } else {
                    alert('Problem Student has not been successfully updated!')
                }
            }
        });

}